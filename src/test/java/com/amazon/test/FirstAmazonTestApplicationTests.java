package com.amazon.test;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstAmazonTestApplicationTests {
public static Logger logger = LoggerFactory.getLogger(FirstAmazonTestApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("The test is runing....");
		
	}

}
