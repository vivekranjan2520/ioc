package spring.code.allatrte;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "spring.code.allatrte")
@PropertySource("classpath:data.properties")
public class StudentConfig {

}
