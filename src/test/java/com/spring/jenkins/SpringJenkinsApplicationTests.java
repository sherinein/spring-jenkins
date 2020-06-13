package com.spring.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringJenkinsApplicationTests {
	
	public static Logger logger=LoggerFactory.getLogger(SpringJenkinsApplication.class);
	@Test
	void contextLoads() {
		logger.info("Test case executing....");
		assertEquals(true,true);
		logger.info("Test case executing finished....");
	}

}
