package com.bnt.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("git-merge/")
public class AdditionController {

	@GetMapping("add")
	public int add(@PathParam("num1") int a,@PathParam("num2") int b){
		
		System.out.println("Akshay");
		System.out.println("Shivam");
		System.out.println("Shivaji");
		System.out.println("Shivani");
		return a+b;
		
	}
}
