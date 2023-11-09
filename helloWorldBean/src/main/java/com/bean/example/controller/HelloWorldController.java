package com.bean.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import hellopack.HelloWorld;

@RestController
public class HelloWorldController 
{
	@GetMapping("/sg")   //this is a site which you have to enter in google after localhost
	public HelloWorld returnHelloWorld()
	{
		return new HelloWorld("Hello,How are you ","Shailesh");
	}
	
}
