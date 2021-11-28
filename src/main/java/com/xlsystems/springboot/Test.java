package com.xlsystems.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world") 
public class Test {
	
//	@GetMapping("")
//	public String msgHelloWorld() {
//		return "Hello World";
//	}
	
	@GetMapping("/soma/{msg}")
	public String soma(@PathVariable String msg) {
		return msg.toUpperCase();
	}
	
	@GetMapping("")
	ResponseEntity<String> hello() {
		return new ResponseEntity<>("Hello World2",HttpStatus.OK);
	}
}
