package spring.code.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerInjectRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Customer cust=context.getBean("customer",Customer.class);
		cust.dispaly();
		Customer cust1=context.getBean("newscustomer",Customer.class);
		cust1.dispaly();
		
	}

}
