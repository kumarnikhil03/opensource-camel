package com.poc.service;

import org.apache.camel.test.spring.CamelSpringJUnit4ClassRunner;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;

@RunWith(CamelSpringJUnit4ClassRunner.class)
//must tell Spring to bootstrap with Camel
@ContextConfiguration(locations = {"classpath:spring/camel-context.xml"})
//Put here to prevent Spring context caching across tests and test methods since some tests inherit
//from this test and therefore use the same Spring context.  Also because we want to reset the
//Camel context and mock endpoints between test methods automatically.
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
@Ignore ("Test not implemented")
public class CamelContextXmlTest  {

	// TODO Create test message bodies that work for the route(s) being tested
	// Expected message bodies
	protected Object[] expectedBodies = { "<something id='1'>expectedBody1</something>",
			"<something id='2'>expectedBody2</something>" };
	// Templates to send to input endpoints
	//@Produce(uri = "cxf:bean:WS?dataFormat=PAYLOAD&loggingFeatureEnabled=true")
	//protected ProducerTemplate inputEndpoint;

	

	@Test
	public void testCamelRoute() throws Exception {


	}

	

}
