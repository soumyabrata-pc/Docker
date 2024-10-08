package com.lern.reactiveSpting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.lern.reactiveSpting.service.IPerchesOrder;

@SpringBootApplication
public class LearnSpringBootMailApplication {

	public static void main(String[] args) {

		//get IOC container
		ApplicationContext ctx=SpringApplication.run(LearnSpringBootMailApplication.class, args);
		// get Service class object ref
		IPerchesOrder order=ctx.getBean("perchaesService",IPerchesOrder.class);
		//invoke method
		try {
		String msg=order.purches(new String[] {"shirt","trouser","watch"},
		new double[] {5000,6000,7000},
		new String[] {"choudhurysoumyabrata0@gmail.com","soumyabratachoudhury1997@gmail.com"});

		System.out.println(msg);
		}
		catch(Exception e) {
		e.printStackTrace();

		}

		//close container
		((ConfigurableApplicationContext) ctx).close();
	}

}
