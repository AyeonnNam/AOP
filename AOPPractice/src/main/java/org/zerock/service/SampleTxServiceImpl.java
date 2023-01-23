package org.zerock.service;

import org.springframework.stereotype.Service;
import org.zerock.mapper.Sample1Mapper;
import org.zerock.mapper.Sample2Mapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
@AllArgsConstructor
public class SampleTxServiceImpl implements SampleTxService{
	
	
	private Sample1Mapper mapper1;
	private Sample2Mapper mapper2;
	
	
	public void addData(String value) {
		
		log.info("mapper1..................");
		mapper1.insertCol1(value);
		
		log.info("mapper2................");

		mapper2.insertCol2(value);
		
		log.info("end.....................");
	}
	
	
	
}
