package rs.enetel.didemo.controllers;

import org.springframework.stereotype.Controller;

import rs.enetel.services.GreetingService;

@Controller
public class MyController {
	
	private GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String hello() {
		System.out.println("Hello!!! ");
		
		return greetingService.sayGreeting();
	}
}
