package com.softengzone.training.spring.requestMapping.controller;

/**
 * Spring Core 4.3 exam preparation
 * 
 * A method element of @RequestMapping annotation is used to specify HTTP request method such as 
 * GET, POST, PUT, DELETE, PATCH. A handler method that is used to serve incoming request depends on 
 * the HTTP method being used.
 * 
 * @author kanczyk
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/requestmapping/httpmethod")
public class HttpMethodController {

	@RequestMapping(method=RequestMethod.GET)
	String getMethod() {
		return "Response: HttpMethod.GET";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	String postMethod() {
		return "Response: HttpMethod.POST";
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	String putMethod() {
		return "Response: HttpMethod.PUT";
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	String deleteMethod() {
		return "Response: HttpMethod.DELETE";
	}
	
	@RequestMapping(method=RequestMethod.PATCH)
	String patchMethod() {
		return "Response: HttpMethod.PATCH";
	}
	
}
