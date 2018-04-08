package com.softengzone.training.spring.requestMapping.controller;

/**
 * Spring Core 4.3 exam preparation
 * 
 * The produces and consumes elements can be used to narrow the request mapping types.
 * The produces element is used to produce the object in the requested media type. It is used together with the @ResponseBody.
 * The consumes element is used to consume the object with the requested media type. It is used together with the @RequestBody.
 * 
 * @author kanczyk
 */

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/requestmapping/producible")
public class ProducibleConsumableController {

	// produce a JSON responses
	@RequestMapping(value = "/produces", produces = MediaType.APPLICATION_JSON_VALUE)
	String produces() {
		return "Produces the object";
	}
	
	// consume JSON or XML present in requests
	@RequestMapping(value="/consumes", consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	String consumes() {
		return "Consumes the objest";
	}
	
}
