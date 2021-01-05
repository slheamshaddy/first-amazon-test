package com.amazon.test;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	
	public static Logger logger = LoggerFactory.getLogger(Controller.class);
	@PostConstruct
	public void init() {
		logger.info("..........Application started successfully..........");
		
	}
	
    @RequestMapping("/")
	public String display() {
    	logger.info("Application executed.......");
    	System.out.println();
		return "Yaaay I just deployed my first Amazon project!";
	}
    @GetMapping("/displayName/{name}")
    public String display2(@PathVariable String name) {
    	logger.info("Application executed.......");
    	return "My name is "+ name;
    }
}
