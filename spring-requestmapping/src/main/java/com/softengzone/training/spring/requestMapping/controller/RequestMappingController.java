package com.softengzone.training.spring.requestMapping.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RequestMappingController {

	@RequestMapping(value= {"", "/home", "/home*", "/home*/*"})
	String getHomePage() {
		return "Multiple URIs mapping for a one method";
	}
	
	// GET http://<host>:<port>/cart?id=100;
	@RequestMapping(value="/cart")
	String getCartById(Long id) {
		return "getCartById() -> Cart id: " + id;
	}
	
	// GET http://<host>:<port>/product/100   - only numeric values are allowed as a request parameter
	// @PathVariable specifies 'id' as a request parameter name doesn't match a method parameter name
	@RequestMapping(value="/product/{id:\\d*}", method = RequestMethod.GET)
	String getProductNameById(@PathVariable("id") Long prodId) {
		return "getProductNameById() : " + prodId; 
	}
	
	// GET http://<host>:<port>/product/cat/catName - a word characters [a-zA-Z_0-9] values are allowed as a request parameter
	// @PathVariable specifies name as a request parameter name matches a method parameter name
	@RequestMapping(value="/product/cat/{name:\\w*}", method = RequestMethod.GET)
	String getProductByCatName(@PathVariable String name) {
		return "getProductByCatName() : " + name;
	}
	
	// http://<host>:<port>/product?id=100
	@PutMapping(value="/product")
	String updateProduct(@RequestParam Long id) {
		return "Product " + id + " updated";
	}
	
	@GetMapping("/stock/prod")
	@ResponseBody ResponseEntity<String> getStockByProdId(@RequestParam Long id) {
		return new ResponseEntity<String>("getStockByProdId() : " + id, HttpStatus.OK);
	}
	
	@PostMapping("/product")
	@ResponseBody ResponseEntity<String> deleteProduct() {
		return new ResponseEntity<String>("deleteProduct()", HttpStatus.OK);
	}
	
	
}
