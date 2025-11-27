package com.javatechie.jenkin.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkinsExampleApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsExampleApplication.class);

	@Test
	 contextLoads() {
		logger.info("Test case executing....");
		logger.info("Test case executing second time....");
		assertEquals(10, 5 + 5);
	}
}
