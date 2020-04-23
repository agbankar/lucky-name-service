package com.ashish.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
/*
@author ashish
test
 */
public class LoggingAspect {
    private static final Logger logger = LogManager.getLogger( LoggingAspect.class);

    @Around("execution(* com.clarion..*.*(..))")
    public Object logAroundAllMethods ( ProceedingJoinPoint proceedingJoinPoint ) throws Throwable {
        logger.info ( proceedingJoinPoint.getSignature ().getName () + ": Started" );
        Object result = proceedingJoinPoint.proceed ();

        logger.info ( proceedingJoinPoint.getSignature ().getName () + ": Exit" );
        return result;
    }
}
