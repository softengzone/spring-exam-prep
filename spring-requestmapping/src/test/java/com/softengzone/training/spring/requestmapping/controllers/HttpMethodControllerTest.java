package com.softengzone.training.spring.requestmapping.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.softengzone.training.spring.requestMapping.SpringRequestmappingApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringRequestmappingApplication.class)
public class HttpMethodControllerTest {
	
	private static final String RESOURCE_LOCATION = "http://localhost:8080/requestmapping";

	@Autowired
	private WebApplicationContext ctx;
	
	private MockMvc mvc;
	
	@Test
	public void test_HttpPost() throws Exception {
//		mvc.perform(get(RESOURCE_LOCATION)
//		   .accept(MediaType.TEXT_PLAIN_VALUE))
//		   .andExpect(status().isOk())
//		   .andReturn().getResponse();
		
		
	}
	
}
