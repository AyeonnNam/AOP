package org.zerock.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class SampleTxServiceTests {

	@Setter(onMethod_ = @Autowired )
	private SampleTxService service;
	
	@Test
	public void testLong() {
		
		String str = "Starry Starry night. Paint your palette blue and grey Look out on a summer's day";
		
		
		log.info(str.getBytes().length);

		service.addData(str);
		
		
		
		}
	
}
