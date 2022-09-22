package com.bnt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	@GetMapping("/sub")
	public void substraction() {
		int a = 20;
		int b = 10;
		System.out.println(a-b);
	}
}
