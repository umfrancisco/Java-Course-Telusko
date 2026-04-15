package com.umfrancisco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.umfrancisco.repository.StudentRepository;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		StudentRepository repository = context.getBean(StudentRepository.class);
		
		System.out.println(repository.findByMarks(72));
	}
}
