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
	
}
