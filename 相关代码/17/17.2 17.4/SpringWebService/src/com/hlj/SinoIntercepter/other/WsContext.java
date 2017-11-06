package com.hlj.SinoIntercepter.other;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;



public class WsContext {
	
	/* �����������Ϣ */
	public static final String IN_REQ_MESSAGE = "IN.REQ.MESSAGE";
	
	/* ��ȥ����Ӧ��Ϣ */
	public static final String OUT_RESP_MESSAGE = "OUT.RESP.MESSAGE";
	
	/* Ӧ��ContextPath */
	public static final String REQUEST_BASEPATH = "REQUEST.BASEPATH";
	
	/* �����ı�ʶ */
	public static final String CONTEXT_ID = "CONTEXT.ID";
	
	private static ThreadLocal<WsContext> threadLocal = new ThreadLocal<WsContext>() {
    	protected WsContext initialValue() {
    		return new WsContext(new HashMap<String, Object>());
    	}
    };
	
    private static ServletContext servletContext;

    private HttpServletRequest httpServletRequest;

    private Map<String, Object> context;
	
    private WsContext(Map<String, Object> context) {
        this.context = context;
    }

    public static WsContext getWsContext() {
        return (WsContext) threadLocal.get();
    }
    
    public String getContextId() {
    	return (String) get(CONTEXT_ID);
    }
    
    public void setContextId(String contextId) {
    	put(CONTEXT_ID, contextId);
    }

    public String getBasePath() {
    	HttpServletRequest request = getHttpServletRequest();
    	if (request == null) {
    		// ������󲻴������context�в���
        	String basePath = (String) get(REQUEST_BASEPATH);
        	if (basePath != null && basePath.trim().length() > 0) {
        		return basePath;
        	}
    		return null;
    	}
    	return request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
    }
    
    public String getRemoteHost() {
    	if (getHttpServletRequest() == null) {
    		return null;
    	}
        return getHttpServletRequest().getRemoteHost();
    }
    
    
    
    
    
    
    
    
    
    public void setInRequestMessage(InMessageEO inMessageEO) {
    	put(IN_REQ_MESSAGE, inMessageEO);
    }
    
    public InMessageEO getInRequestMessage() {
    	return (InMessageEO) get(IN_REQ_MESSAGE);
    }
    
    public void setOutResponseMessage(OutMessageEO outMessageEO) {
    	put(OUT_RESP_MESSAGE, outMessageEO);
    }
    
    public OutMessageEO getOutResponseMessage() {
    	return (OutMessageEO) get(OUT_RESP_MESSAGE);
    }
    
    public Object get(String key) {
        return context.get(key);
    }

    public void put(String key, Object value) {
    	context.put(key, value);
    }
    
    public void remove(String key) {
    	context.remove(key);
    }
    
    public ServletContext getServletContext() {
        return servletContext;
    }

    public void setServletContext(ServletContext servletContext) {
    	WsContext.servletContext = servletContext;
    }
    
    public synchronized static void setAttributeForServletContext(String key, Object value) {
		WsContext.getWsContext().getServletContext().setAttribute(key, value);
	}

	public synchronized static Object getAttributeFromServletContext(String key) {
		return WsContext.getWsContext().getServletContext().getAttribute(key);
	}
    
    public HttpSession getHttpSession() {
    	if (httpServletRequest == null) {
    		return null;
    	}
        return httpServletRequest.getSession();
    }

    public void setAttributeForSessionContext(String key, Object value) {
    	if (WsContext.getWsContext().getHttpSession() != null) {
    		WsContext.getWsContext().getHttpSession().setAttribute(key, value);
    	}
    }
    
    public Object getAttributeFromSessionContext(String key) {
    	if (WsContext.getWsContext().getHttpSession() == null) {
    		return null;
    	}
		return WsContext.getWsContext().getHttpSession().getAttribute(key);
	}

	public HttpServletRequest getHttpServletRequest() {
		return httpServletRequest;
	}

	public void setHttpServletRequest(HttpServletRequest httpServletRequest) {
		this.httpServletRequest = httpServletRequest;
	}
    
}
