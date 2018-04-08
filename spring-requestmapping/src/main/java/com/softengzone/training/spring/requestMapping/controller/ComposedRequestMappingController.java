package com.softengzone.training.spring.requestMapping.controller;

/**
 * Spring Core 4.3 exam preparation
 * 
 * Since Spring 4.3 a new method-level annotations have been introduced. They wrap @RequestMapping standard annotation. 
 * We have the following composed annotation: 
 * @GetMapping wrapper for @RequestMapping(method=RequestMethod.GET)
 * @PostMapping wrapper for @RequestMapping(method=RequestMethod.POST)
 * @PutMapping wrapper for @RequestMapping(method=RequestMethod.PUT)
 * @DeleteMapping wrapper for @RequestMapping(method=RequestMethod.DELETE)
 * @PatchMapping wrapper for @RequestMapping(method=RequestMethod.PATCH)
 * 
 * @author kanczyk
 */

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/requestmapping/composed")
public class ComposedRequestMappingController {

	@GetMapping()
	String getMethod() {
		return "Response: HttpMethod.GET";
	}
	
	@PostMapping
	String postMethod() {
		return "Response: HttpMethod.POST";
	}
	
	@PutMapping
	String putMethod() {
		return "Response: HttpMethod.PUT";
	}
	
	@DeleteMapping
	String deleteMethod() {
		return "Response: HttpMethod.DELETE";
	}
	
	@PatchMapping
	String patchMethod() {
		return "Response: HttpMethod.PATCH";
	}
	
}
