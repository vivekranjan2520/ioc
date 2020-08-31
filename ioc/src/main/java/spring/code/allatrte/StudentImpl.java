package spring.code.allatrte;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentImpl {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
		Student student=context.getBean("student",Student.class);
		System.out.println(student.getName());
	}
}
