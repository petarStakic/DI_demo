package rs.enentel.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import rs.enentel.didemo.services.GreetingService;

@Controller
public class PropertyInjectedController {

		@Autowired
		public GreetingService greetingServiceImpl;
		
		public String sayHello() {
			return greetingServiceImpl.sayGreeting();
		}
	
}
