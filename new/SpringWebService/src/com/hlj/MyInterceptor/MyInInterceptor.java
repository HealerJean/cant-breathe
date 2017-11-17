package com.hlj.MyInterceptor;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.interceptor.InInterceptors;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.log4j.Logger;

/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��10��11�� ����3:38:42 
 * ��˵��  �ڿͻ��˵���֮ǰִ�� 
 */
public class MyInInterceptor extends AbstractPhaseInterceptor<Message> { 
    private static final Logger log = Logger.getLogger(MyInInterceptor.class); 
     
    public MyInInterceptor() { 
        //���ʹ��receive�����յ���˼ 
        super(Phase.RECEIVE); 
    } 
 
    public void handleMessage(Message message){ 
         
        try { 
            InputStream is = message.getContent(InputStream.class); 
            //������Զ��������������ж�ȡ���ݣ�Ȼ���޸�Ϊ�Լ���Ҫ������ 
             
            //������ϣ�д�ص�message�� 
            //��������Ҫע��һ����ǣ�����޸ĺ��soap��Ϣ��ʽ������webservice��ܸ�ʽ�����磺��ܷ�װ��ĸ�ʽΪ 
            //<soap:Envelope xmlns:soap="http://www.w3.org/2001/12/soap-envelope" <soap:Body> 
            //<�����ǵ��÷���˷����������ռ�><���ǲ�������>  
            //���������������Ϣ 
            //</�����ǵ��÷���˷����������ռ�></���ǲ�������> 
            //</soap:Body> 
            //</soap:Envelope> 
            //������������ָ�ʽ���ڱ�¶�Ľӿڷ�����Ż��������յ���Ϣ���������������body��ߣ�û�мӷ��������ռ�Ͳ������ƣ�ֱ�Ӿ�����Ϣ�� 
            //�ǽӿڷ������ǽ��ղ�����Ϣ�ģ���Ϊcxf�ǰ�����������ָ�ʽȥ�����ģ������������������ĸ�ʽ����Ӧ�������������� 
            //����������������������롭�������������� 

            
          //  String xml = IOUtils.toString(is);  
                
            if(is != null) 
                message.setContent(InputStream.class, is); 
        } catch (Exception e) { 
            log.error("Error when split original inputStream. CausedBy : "+"\n"+e); 
        } 
    } 
} 