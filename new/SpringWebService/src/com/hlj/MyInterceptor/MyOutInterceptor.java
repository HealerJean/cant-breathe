package com.hlj.MyInterceptor;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.interceptor.OutInterceptors;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.log4j.Logger;


/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��10��11�� ����3:40:58 
 * ��˵��  �ڿͻ��˵��÷���ȡ��return֮��ִ��
 */
public class MyOutInterceptor extends AbstractPhaseInterceptor<Message>{ 
    private static final Logger log = Logger.getLogger(MyOutInterceptor.class); 
 
    public MyOutInterceptor() { 
        //���ʹ��pre_stream����˼Ϊ�����ر�֮ǰ 
        super(Phase.PRE_STREAM); 
    } 
 
    public void handleMessage(Message message) { 
 
        try { 
 
            OutputStream os = message.getContent(OutputStream.class); 
 
            CachedStream cs = new CachedStream(); 
 
            message.setContent(OutputStream.class, cs); 
 
            message.getInterceptorChain().doIntercept(message); 
 
            CachedOutputStream csnew = (CachedOutputStream) message.getContent(OutputStream.class); 
            InputStream in = csnew.getInputStream(); 
             
            String xml = IOUtils.toString(in); 
             
            //�����xml�������������ͬ��д������ 
            IOUtils.copy(new ByteArrayInputStream(xml.getBytes()), os); 
             
            cs.close(); 
            os.flush(); 
 
            message.setContent(OutputStream.class, os); 
 
 
        } catch (Exception e) { 
            log.error("Error when split original inputStream. CausedBy : " + "\n" + e); 
        } 
    } 
 
    private class CachedStream extends CachedOutputStream { 
 
        public CachedStream() { 
 
            super(); 
 
        } 
 
        protected void doFlush() throws IOException { 
 
            currentStream.flush(); 
 
        } 
 
        protected void doClose() throws IOException { 
 
        } 
 
        protected void onWrite() throws IOException { 
 
        } 
 
    } 
 
} 