package com.allen.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@RequestMapping("/index")
	@ResponseBody
	public String sayHello() {
		return "hello world";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
