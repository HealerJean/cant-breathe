package org.dsp.oa.xinjiangzzqpast;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.dsp.core.ws.result.Result;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��9��8�� ����9:46:20 
 * ��˵�� 
 * ���н��
 * 
 * 
 * ǰ��֪ͨ
���뻷��֪ͨ
save����
���ս��
����֪ͨ
�˳�����
 */
@Component 
@Aspect //��ǰ���ʶΪһ�����湩������ȡ  ,��@Aspect������ͷ�ϣ����������Ϊһ�����档
@Order(1) // ���ƶ��Aspect��ִ��˳��ԽСԽ��ִ��

public class AspectStyleMethod {
	// @Pointcut���ڷ���ͷ�ϣ�����һ���ɱ���ķ������õ��������ʽ��
	@Pointcut("execution(* org.dsp.oa.xinjiangzzqpast.AspectStyleService.*(..))")
    private void anyMethod(){}


    @Before("anyMethod()") 	//��ʶһ��ǰ����ǿ����
    public void doAccessCheck() {
        System.out.println("ǰ��֪ͨ  @Before");
    }
    @After("anyMethod()")  //final��ǿ���������׳��쳣���������˳�����ִ��
    public void after() {
        System.out.println("���ս��  @After");
    }
    @AfterReturning("anyMethod()") //������ǿ�����������˳�ʱִ��
    public void doAfter() {
        System.out.println("����֪ͨ @AfterReturning");
    }
    @AfterThrowing("anyMethod()") //�쳣�׳���ǿ
    public void doAfterThrow() {
        System.out.println("����֪ͨ");
    }
    /**
     * * ������뷵��һ��object
     *
     */
    @Around("anyMethod()") //������ǿ��
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("���뻷��֪ͨ   @Around");
        try {
         	 Object object = pjp.proceed();
         	 System.out.println("pjp.proceed() ��ִ��");//��ʵ����û��ִ�У���ΪAspectStyleService�������쳣�����Բ��ᵽ��һ��
            return object;
           
		} catch (Exception e) { //���˵�����쳣���ᵱ��������ս�� @After ��@AfterThrowing ִ����ϣ���ִ�������
		   //ȡ�÷���ǩ��
			MethodSignature methodsignature = (MethodSignature) pjp.getSignature();           
		   //����ǩ���õ����ص����� ���ﷵ�ص���һ�����ǵ�ʵ��
			if (methodsignature.getReturnType().equals(AspectEntry.class)) {    
             	AspectEntry personFinal = new AspectEntry("��������Name", 20);
    	
             	System.out.println("��ӡ�쳣��Ϣ"+e.getMessage());
             	//��������ֵ��Ҳ������ִ��service���쳣֮�����Ϣ�ˣ���Ϊ��Ȼ���˷���ֵ����ִ�и���                
             	return personFinal;       
             	}
			
		}     
        
        System.out.println("�˳�����  @Around");
		return null;
    }
    /*    1�������쳣�������ӡ
			    ǰ��֪ͨ  @Before
			    ���뻷��֪ͨ   @Around
			   save����
			    ���ս��  @After
			    ����֪ͨ
			  Exception in thread "main" java.lang.ArithmeticException: / by zero
    */
    // ˳��: before->method->after->afterReturning
}
