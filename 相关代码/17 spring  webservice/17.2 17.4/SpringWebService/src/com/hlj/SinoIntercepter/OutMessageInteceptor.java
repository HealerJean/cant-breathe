package com.hlj.SinoIntercepter;

import java.io.OutputStream;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.cxf.interceptor.AbstractLoggingInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.LoggingMessage;
import org.apache.cxf.io.CacheAndWriteOutputStream;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.io.CachedOutputStreamCallback;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;
import org.springframework.beans.factory.annotation.Autowired;

import com.hlj.SinoIntercepter.other.Channel;
import com.hlj.SinoIntercepter.other.ExceptionUtil;
import com.hlj.SinoIntercepter.other.InMessageEO;
import com.hlj.SinoIntercepter.other.InOutType;
import com.hlj.SinoIntercepter.other.OutMessageEO;
import com.hlj.SinoIntercepter.other.RespStatus;
import com.hlj.SinoIntercepter.other.WsContext;


/**
 * 服务端ws消息响应日志拦截器
 */
public class OutMessageInteceptor extends AbstractLoggingInterceptor {

	

    public OutMessageInteceptor(){
        super(Phase.PRE_STREAM);
        limit = -1; // 不进行报文长度限制
    }
    
    @Override
    public void handleMessage(Message message) throws Fault {
    	if (message.getExchange().getInMessage() != null) {
    		/* 出去响应消息 */
    		final OutputStream os = message.getContent(OutputStream.class);
            if (os == null) {
                return;
            }
            
            final CacheAndWriteOutputStream newOut = new CacheAndWriteOutputStream(os);
            message.setContent(OutputStream.class, newOut);
            newOut.registerCallback(new LoggingCallback(message, os));
    	}
        
    }
    
    @Override
    public void handleFault(Message message) {
    	if (message.getExchange().getInMessage() != null) {
    		/* 出去响应消息，处理调用或出去拦截器链上发生的异常 */
    		InMessageEO inMessageEO = WsContext.getWsContext().getInRequestMessage();
    		Exception e = message.getContent(Exception.class);
        	String stackTrace = ExceptionUtil.getStackTraceAsString(e);
    		HttpServletRequest httpServletRequest = (HttpServletRequest) message
					.getExchange().getInMessage().get("HTTP.REQUEST");
  
    		
    /*		OutMessageEO outMessageEO = wsService.saveOutMessage(
					WsContext.getWsContext().getContextId(), 
					httpServletRequest.getRemoteAddr(), //ip地址
					Channel.Webservice.getCode(),  //表明为webservice服务
					InOutType.Response.getCode(),  //响应还是请求 
					stackTrace,  //异常信息
					inMessageEO.getPkInMessage(), //入烂机器的主键
					RespStatus.Exception.getCode());// //表明是异常 
					
    		WsContext.getWsContext().setOutResponseMessage(outMessageEO);
    		*/
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
    
    class LoggingCallback implements CachedOutputStreamCallback {
        private final Message message;
        private final OutputStream origStream;
        
        public LoggingCallback(final Message msg, final OutputStream os) {
            this.message = msg;
            this.origStream = os;
        }

        public void onFlush(CachedOutputStream cos) {  
        }
        
        public void onClose(CachedOutputStream cos) {
            String id = (String)message.getExchange().get(LoggingMessage.ID_KEY);
            if (id == null) {
                id = LoggingMessage.nextId();
            }
            final LoggingMessage buffer 
                = new LoggingMessage("Outbound Message\n---------------------------",
                                     id);
            
            Integer responseCode = (Integer)message.get(Message.RESPONSE_CODE);
            if (responseCode != null) {
                buffer.getResponseCode().append(responseCode);
            }
            
            String encoding = (String)message.get(Message.ENCODING);

            if (encoding != null) {
                buffer.getEncoding().append(encoding);
            }            
            String httpMethod = (String)message.get(Message.HTTP_REQUEST_METHOD);
            if (httpMethod != null) {
                buffer.getHttpMethod().append(httpMethod);
            }
            String address = (String)message.get(Message.ENDPOINT_ADDRESS);
            if (address != null) {
                buffer.getAddress().append(address);
            }
            String ct = (String)message.get(Message.CONTENT_TYPE);
            if (ct != null) {
                buffer.getContentType().append(ct);
            }
            Object headers = message.get(Message.PROTOCOL_HEADERS);
            if (headers != null) {
                buffer.getHeader().append(headers);
            }
            try {
                writePayload(buffer.getPayload(), cos, encoding, ct); 
            } catch (Exception ex) {
                //ignore
            	ex.printStackTrace();
            }
            
        	String payload = buffer.getPayload().toString();
			HttpServletRequest httpServletRequest = (HttpServletRequest) message
					.getExchange().getInMessage().get("HTTP.REQUEST");
        	//插入数据库
			
/*			
			OutMessageEO outMessageEO = wsService.saveOutMessage(
					WsContext.getWsContext().getContextId(), 
					httpServletRequest.getRemoteAddr(), 
					Channel.Webservice.getCode(),
					InOutType.Response.getCode(), 
					payload, 
					inMessageEO.getPkInMessage(),
					RespStatus.Normal.getCode());
			WsContext.getWsContext().setOutResponseMessage(outMessageEO);
			*/
	    	System.out.println(
						WsContext.getWsContext().getContextId()+ 
						httpServletRequest
						.getRemoteAddr()+
						Channel.Webservice.getCode()+
						InOutType.Request.getCode()+
						payload);
            
            try {
                cos.lockOutputStream();
                cos.resetOut(null, false);
            } catch (Exception ex) {
            	ex.printStackTrace();
            }
            message.setContent(OutputStream.class, origStream);
        }
    }

	@Override
	protected Logger getLogger() {
		return null;
	}


}
