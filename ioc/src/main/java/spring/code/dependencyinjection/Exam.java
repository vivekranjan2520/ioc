package spring.code.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student st = context.getBean("student", Student.class);
		System.out.println(st.getStudentName());
		System.out.println(st.getId());
		
		
		Student student = new Student();
		student.setStudentName("vivek");
		System.out.println(student.getStudentName());
	}

}
