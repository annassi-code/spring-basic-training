package com.application.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectInterceptor {

    @Pointcut("execution(* com.application.model.*.toString(..))")
    public void intercept(){

    }

    @Before("intercept()")
    public void interceptToString(){
        System.out.println("Intercept...");
    }

   @AfterReturning(pointcut="intercept()", returning="result")
    public void interceptorToStringReturning(String result){
        //System.out.println(result);
        System.out.println("An instrument is being played");
    }

 //   @Before("@annotation(com.application.annotation.MyAnnotation)")
    public void beforeAnnotation(){
        System.out.println("Hi from my annotation!");
    }


    @Around("@annotation(com.application.annotation.MyAnnotation)")
    public void interceptWithAnnotation(ProceedingJoinPoint joinPoint) {
        System.out.println("aspect launched via annotation");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
