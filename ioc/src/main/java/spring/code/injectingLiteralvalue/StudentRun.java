package spring.code.injectingLiteralvalue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentRun {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		Student st = context.getBean("student", Student.class);
		System.out.println(st.getId());
		System.out.println(st.getName());
	}

}
