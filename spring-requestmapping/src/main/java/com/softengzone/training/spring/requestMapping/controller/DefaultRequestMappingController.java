
package com.softengzone.training.spring.requestMapping.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Core 4.3 exam preparation
 * 
 * The controller class can have default handler method which is called with a request to a default URI, 
 * which is the one specified in RequestMapping annotation at a class level
 * 
 * @author kanczyk
 * 
 */

@RestController
@RequestMapping("/requestmapping/default")
public class DefaultRequestMappingController {

	@RequestMapping
	String getDefault() {
		return "Default request handler method. The @RequestMapping annotation doesn't specify any value";
	}
	
}
