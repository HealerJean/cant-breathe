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
 * @author 作者 HealerJean
 * @version 创建时间：2017年9月8日 上午9:46:20 
 * 类说明 
 * 运行结果
 * 
 * 
 * 前置通知
进入环绕通知
save方法
最终结果
后置通知
退出方法
 */
@Component 
@Aspect //当前类标识为一个切面供容器读取  ,、@Aspect放在类头上，把这个类作为一个切面。
@Order(1) // 控制多个Aspect的执行顺序，越小越先执行

public class AspectStyleMethod {
	// @Pointcut放在方法头上，定义一个可被别的方法引用的切入点表达式。
	@Pointcut("execution(* org.dsp.oa.xinjiangzzqpast.AspectStyleService.*(..))")
    private void anyMethod(){}


    @Before("anyMethod()") 	//标识一个前置增强方法
    public void doAccessCheck() {
        System.out.println("前置通知  @Before");
    }
    @After("anyMethod()")  //final增强，不管是抛出异常或者正常退出都会执行
    public void after() {
        System.out.println("最终结果  @After");
    }
    @AfterReturning("anyMethod()") //后置增强，方法正常退出时执行
    public void doAfter() {
        System.out.println("后置通知 @AfterReturning");
    }
    @AfterThrowing("anyMethod()") //异常抛出增强
    public void doAfterThrow() {
        System.out.println("例外通知");
    }
    /**
     * * 这里必须返回一个object
     *
     */
    @Around("anyMethod()") //环绕增强，
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("进入环绕通知   @Around");
        try {
         	 Object object = pjp.proceed();
         	 System.out.println("pjp.proceed() 后执行");//其实它并没有执行，因为AspectStyleService中有了异常，所以不会到这一步
            return object;
           
		} catch (Exception e) { //如果说捕获到异常，会当上面的最终结果 @After 和@AfterThrowing 执行完毕，再执行下面的
		   //取得方法签名
			MethodSignature methodsignature = (MethodSignature) pjp.getSignature();           
		   //方法签名得到返回的类型 这里返回的是一个我们的实体
			if (methodsignature.getReturnType().equals(AspectEntry.class)) {    
             	AspectEntry personFinal = new AspectEntry("重新授予Name", 20);
    	
             	System.out.println("打印异常信息"+e.getMessage());
             	//给定返回值，也不会再执行service中异常之后的信息了，因为既然有了返回值，还执行个球                
             	return personFinal;       
             	}
			
		}     
        
        System.out.println("退出方法  @Around");
		return null;
    }
    /*    1、出现异常的情况打印
			    前置通知  @Before
			    进入环绕通知   @Around
			   save方法
			    最终结果  @After
			    例外通知
			  Exception in thread "main" java.lang.ArithmeticException: / by zero
    */
    // 顺序: before->method->after->afterReturning
}
