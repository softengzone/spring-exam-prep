package com.softengzone.training.spring.requestMapping.controller;

/**
 * Spring Core 4.3 exam preparation
 * 
 * A header element of the @RequestMapping annotation can be used to narrow down the request mapping.
 * It can be more then one header specified in the header element.
 * 
 * @author kanczyk
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/requestmapping/headers")
public class HeadersRequestMappingController {

	@RequestMapping(headers = {"content-type=text/html", "content-type=text/plain"})
	String findProductNameById() {
		return "content-type=text/plain";
	}
	
}
