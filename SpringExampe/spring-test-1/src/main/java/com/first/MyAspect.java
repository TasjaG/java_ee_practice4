package com.first;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(* HelloBean.setName(..))")
    public void logBeforeV1(JoinPoint joinPoint) 
    {
        System.out.println("MyAspect.logBeforeV1() : " + joinPoint.getSignature().getName());
    }
     
    @Before("execution(* HelloBean.*(..))")
    public void logBeforeV2(JoinPoint joinPoint) 
    {
        System.out.println("MyAspect.logBeforeV2() : " + joinPoint.getSignature().getName());
    }
     
    @After("execution(* HelloBean.setName(..))")
    public void logAfterV1(JoinPoint joinPoint) 
    {
        System.out.println("MyAspect.logAfterV1() : " + joinPoint.getSignature().getName());
    }
     
    @After("execution(* HelloBean.*(..))")
    public void logAfterV2(JoinPoint joinPoint) 
    {
        System.out.println("MyAspect.logAfterV2() : " + joinPoint.getSignature().getName());
    }
}
