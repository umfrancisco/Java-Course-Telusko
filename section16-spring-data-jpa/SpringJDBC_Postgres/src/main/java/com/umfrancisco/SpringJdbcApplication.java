package com.umfrancisco;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.umfrancisco.model.Student;
import com.umfrancisco.service.StudentService;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);
		
		Student s = context.getBean(Student.class);
		s.setRollNo(104);
		s.setName("Navin");
		s.setMarks(78);
		
		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);
		
		List<Student> students = service.getStudents();
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
	}
}
