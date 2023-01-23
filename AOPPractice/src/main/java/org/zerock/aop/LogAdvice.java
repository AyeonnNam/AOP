package org.zerock.aop;

import java.sql.Time;
import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Component
public class LogAdvice {
	
	@Before("execution(* org.zerock.service.SampleService*.*(..))")
	public void logBefore() {
		log.info("===========================");
	}
	
//	@Before("execution(* org.zerock.service.SampleTxService*.addData(String)) &&args(value)")
//	public void logBeforeWithParam(String value) {
//		log.info("str" + value);
//		
//
//		
//	}
	
	@AfterThrowing(pointcut = "execution(* org.zerock.service.SampleTxService*.*(..))", throwing = "exception")
	public void logException(Exception exception) {
		
		log.info("Exception....!!!!");
		log.info("exception : " + exception);
		}
	
	
	@Around("execution(* org.zerock.service.SampleTxService*.*(..))")
	public Object logTime(ProceedingJoinPoint pjp) {
		
		long start = System.currentTimeMillis();
		
		log.info("Target: " + pjp.getTarget());
		log.info("Param:  " + Arrays.toString(pjp.getArgs()));
		
		
		Object result = null;
		
		try {
			
			result = pjp.proceed();
			} catch (Throwable e) {
				e.printStackTrace();
			}
		
		long end = System.currentTimeMillis();
		
		log.info("Time : " + (end-start) );
		 
		return result;
		
	}
	
	
}
