package com.example.learn_jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LearnJenkinsApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(LearnJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		log.info("Testing files are started....");
		Assertions.assertEquals(true,true);
		log.info("Testing done successfully...");
	}

}
