package rs.enentel.didemo.controllers;

import rs.enentel.didemo.services.GreetingService;

public class ConstructorInjectedController {

	private GreetingService greetingService;
	
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
}
