package com.hari.jenkin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkimsApplicationTests {
	static private Logger logger=LoggerFactory.getLogger(SpringJenkimsApplicationTests.class);
	@Test
	public void contextLoads() {
		logger.info("Test case executed");
		assertEquals(true, true);
	}

}
