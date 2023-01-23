package org.zerock.aop;

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
	
	@Before("execution(* org.zerock.service.SampleService*.doAdd(String,String)) &&(str1, str2)")
	public void logBeforeWithParam(String str1, String str2) {
		log.info("str1:" +str1);

		log.info("str2:" +str2);

		
	}
	
}
