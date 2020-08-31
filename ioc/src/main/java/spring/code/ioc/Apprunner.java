package spring.code.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Apprunner {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Sim sim1 = context.getBean("sim", Sim.class);
		sim1.calling();

		Sim sims = context.getBean("airtel", Airtel.class);
		sims.calling();

		Airtel airtel = new Airtel();
		airtel.calling();
		Vodafone voda = new Vodafone();
		voda.calling();
		Sim sim = new Airtel();
		sim.calling();

	}

}
/*spring framework has their own container called ioc read your config file beans.xml and create all object that have written in beans.xml .IOC manage and create object
 * 
 *  2 types of ioc container 
 *  BeanFactory ----it is depricated and used for backward compatability
 *  ApplicationContext --it has some advance feature
 *  
 *  ApplicationContext and BeanFactory both are interface to implement we hahe to use some implemented class ClassPathXmlApplicationContext
 *  
 *  IoC is all about inverting the control. To explain this in layman's terms, suppose you drive a car to your work place. 
 *  This means you control the car.
 *   The IoC principle suggests to invert the control, meaning that instead of driving the car yourself, you hire a cab, where another person will drive the car. 
 *   Thus, this is called inversion of the control - from you to the cab driver.
 *    You don't have to drive a car yourself and you can let the driver do the driving so that you can focus on your main work.
 *  */
