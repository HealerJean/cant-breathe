package com.hlj.SinoIntercepter;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.interceptor.AbstractLoggingInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.LoggingMessage;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;

import com.hlj.SinoIntercepter.other.Channel;
import com.hlj.SinoIntercepter.other.ExceptionUtil;
import com.hlj.SinoIntercepter.other.IdUtil;
import com.hlj.SinoIntercepter.other.InMessageEO;
import com.hlj.SinoIntercepter.other.InOutType;
import com.hlj.SinoIntercepter.other.OutMessageEO;
import com.hlj.SinoIntercepter.other.RespStatus;
import com.hlj.SinoIntercepter.other.WsContext;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * 服务端ws消息请求日志拦截器
 */
public class InMessageInteceptor extends AbstractLoggingInterceptor {
	

	public InMessageInteceptor() {
		super(Phase.RECEIVE); // 必须在 READ 阶段前，否则消息 payload 获取不到
		limit = -1; // 不进行报文长度限制
	}
	
    public void handleMessage(Message message) throws Fault {
		if (message.getExchange().getOutMessage() == null) {
			/* 进入请求消息 */
			WsContext.getWsContext().setContextId(IdUtil.uuid32()); // 事件起点，分配上下文标识
	    	String payload = getMessagePlayload(message); // 消息负载
			HttpServletRequest httpServletRequest = (HttpServletRequest) message.get("HTTP.REQUEST");
	    	WsContext.getWsContext().setHttpServletRequest(httpServletRequest);
	    	
/*
	    	//InMessageEO zhge
			InMessageEO inMessageEO = wsService.saveInMessage(
					WsContext.getWsContext().getContextId(), 
					httpServletRequest
					.getRemoteAddr(), 
					Channel.Webservice.getCode(),
					InOutType.Request.getCode(), 
					payload,
					null,null);
			WsContext.getWsContext().setInRequestMessage(inMessageEO);*/
			
	    	//插入数据库zhon
	    	System.out.println(
					WsContext.getWsContext().getContextId()+ 
					httpServletRequest
					.getRemoteAddr()+
					Channel.Webservice.getCode()+
					InOutType.Request.getCode()+
					payload);
		} 
		
    }
    
    
    protected String getMessagePlayload(Message message) {
    	//默认为1
        String id = (String)message.getExchange().get(LoggingMessage.ID_KEY);
        if (id == null) {
            id = LoggingMessage.nextId();
            message.getExchange().put(LoggingMessage.ID_KEY, id);
        }
        message.put(LoggingMessage.ID_KEY, id);
        final LoggingMessage buffer 
            = new LoggingMessage("Inbound Message\n----------------------------", id);

        Integer responseCode = (Integer)message.get(Message.RESPONSE_CODE);
        if (responseCode != null) {
            buffer.getResponseCode().append(responseCode);
        }
        //编码格式 encoding --- utf8
        String encoding = (String)message.get(Message.ENCODING);

        if (encoding != null) {
            buffer.getEncoding().append(encoding);
        }
        //http 请求方法 post or get 这是get
        String httpMethod = (String)message.get(Message.HTTP_REQUEST_METHOD);
        if (httpMethod != null) {
            buffer.getHttpMethod().append(httpMethod);
        }
        //message 内容类型 text/xml; charset=UTF-8
        String ct = (String)message.get(Message.CONTENT_TYPE);
        if (ct != null) {
            buffer.getContentType().append(ct);
        }
        Object headers = message.get(Message.PROTOCOL_HEADERS);

        if (headers != null) {
            buffer.getHeader().append(headers);
        }
        //http://localhost:8080/SpringWebService/services/CommonService
        String uri = (String)message.get(Message.REQUEST_URL);
        if (uri != null) {
            buffer.getAddress().append(uri);
            String query = (String)message.get(Message.QUERY_STRING);
            if (query != null) {
                buffer.getAddress().append("?").append(query);
            }
        }
            
        InputStream is = message.getContent(InputStream.class);
        if (is != null) {
            CachedOutputStream bos = new CachedOutputStream();
            try {
                IOUtils.copy(is, bos);

                bos.flush();
                is.close();

                message.setContent(InputStream.class, bos.getInputStream());
                writePayload(buffer.getPayload(), bos, encoding, ct); 
                
                return buffer.getPayload().toString();
            } catch (Exception e) {
                throw new Fault(e);
            } finally {
            	try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
            }
        }
        return "";
    }

	@Override
	protected Logger getLogger() {
		return null;
	}

	
	/**
	 * 请求调用前（进入拦截器链上发生错误）异常响应处理 
	 */
	@Override
	public void handleFault(Message message) {
		if (message.getExchange().getOutMessage() == null) {
			/* 请求调用前（进入拦截器链上发生错误）异常响应处理 */
			Exception e = message.getContent(Exception.class);
			HttpServletRequest httpServletRequest = (HttpServletRequest) message
					.getExchange().getInMessage().get("HTTP.REQUEST");
			String stackTrace = ExceptionUtil.getStackTraceAsString(e);
			InMessageEO inMessageEO = WsContext.getWsContext().getInRequestMessage();
			
			

		/*	OutMessageEO outMessageEO = wsService.saveOutMessage(
					WsContext.getWsContext().getContextId(), 
					httpServletRequest.getRemoteAddr(), 
					Channel.Webservice.getCode(), 
					InOutType.Response.getCode(), 
					stackTrace, 
					inMessageEO.getPkInMessage(), 
					RespStatus.Exception.getCode());
			WsContext.getWsContext().setOutResponseMessage(outMessageEO);*/
			
			System.out.println(
					WsContext.getWsContext().getContextId()+ 
					httpServletRequest.getRemoteAddr()+ 
					Channel.Webservice.getCode()+ 
					InOutType.Response.getCode()+  
					stackTrace+ 
					inMessageEO.getPkInMessage()+ 
					RespStatus.Exception.getCode());
		}
	}
	
}
