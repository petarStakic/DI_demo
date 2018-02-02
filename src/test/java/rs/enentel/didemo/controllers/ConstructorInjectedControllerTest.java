package rs.enentel.didemo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import rs.enentel.didemo.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {
	private ConstructorInjectedController constructorInjectedController;
	
	@Before
	public void setUp() throws Exception {
		this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
	}
	
	@Test
	public void testGreeting() throws Exception {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
	}
}
