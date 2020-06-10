package com.application.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class Log4jAspect {

    Logger logger = Logger.getLogger("Log4jAspect");

    @Around("execution(* com.application.dao.UserDao.findUser(..))")
    public Object interceptDaoMethods(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("method " + joinPoint.getSignature() + " of class " + joinPoint.getTarget() + "is called");
        Object object = joinPoint.proceed();
        if (object != null) logger.info("method returned : " + object);
        return object;
    }
}
