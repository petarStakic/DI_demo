package rs.enentel.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import rs.enentel.didemo.controllers.ConstructorInjectedController;
import rs.enentel.didemo.controllers.MyController;
import rs.enentel.didemo.controllers.PropertyInjectedController;
import rs.enentel.didemo.controllers.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		
		MyController controller = (MyController) ctx.getBean("myController");
		
		controller.hello();
		
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
