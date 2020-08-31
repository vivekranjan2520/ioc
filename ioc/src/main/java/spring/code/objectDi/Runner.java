package spring.code.objectDi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		Student student=context.getBean("studentobj",Student.class);
		student.cheating();
		
		
	/*	Student st = new Student();
		MathCheat mathcheat = new MathCheat();
		st.setMathcheat(mathcheat);
		st.cheating();*/
	}

}
