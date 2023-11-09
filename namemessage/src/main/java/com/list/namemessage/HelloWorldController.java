package com.list.namemessage;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController 
{
		@GetMapping("/hello-world-beans-list")
		public List<HelloWorld> returnHelloWorldList()
		{
			return Arrays.asList(new HelloWorld("Hello","Shailesh"),new HelloWorld("Hello","Raj"),new HelloWorld("Hello","Amit"),new HelloWorld("Hello","Swapnil"));
		}
		
		
		@GetMapping("/hello-world-get-by-name/{name}")
		public HelloWorld returnHelloWorldByName(@PathVariable String name)
		{
			List<HelloWorld> helloWorldList = Arrays.asList(new HelloWorld("Hello","Shailesh"),new HelloWorld("Hello","Raj"),new HelloWorld("Hello","Amit"),new HelloWorld("Hello","Swapnil"));
			for(HelloWorld helloworld :helloWorldList)
			{
				if(helloworld.getName().equalsIgnoreCase(name))
				{
					return helloworld;
				}
			}
			return null;
		}
}

