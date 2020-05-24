package com.lbx.girl.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/5/24 11:54
 * NOTE:
 */
@Component
@Aspect
public class GirlAspect {
    private final static Logger logger = LoggerFactory.getLogger(GirlAspect.class);


    @Pointcut("execution(public * com.lbx.girl.controller.GirlController.*(..) )")
    public void log() {
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        /*
         * URL*/
        logger.info("URL={}", request.getRequestURL());
        /*
         * method*/
        logger.info("method={}", request.getMethod());
        /*
         * IP*/
        logger.info("IP={}", request.getRemoteAddr());
        /*
         * 类方法*/
        logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        /*
         * 参数*/
        logger.info("args={}", joinPoint.getArgs());
    }

    @AfterReturning(pointcut = "log()", returning = "object")
    public void afterReturning(Object object) {
        logger.info("response={}", object);
    }
}
