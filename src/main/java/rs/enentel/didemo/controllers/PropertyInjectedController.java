package rs.enentel.didemo.controllers;

import rs.enentel.didemo.services.GreetingServiceImpl;

public class PropertyInjectedController {

		public GreetingServiceImpl greetingService;
		
		String sayHello() {
			return greetingService.sayGreeting();
		}
	
}
