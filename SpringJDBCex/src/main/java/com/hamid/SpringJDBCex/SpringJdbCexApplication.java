package com.hamid.SpringJDBCex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbCexApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbCexApplication.class, args);

		Student std = context.getBean(Student.class);
		std.setRollNo(104);
		std.setName("Md Mahtab");
		std.setMarks(92);

		StudentService service = context.getBean(StudentService.class);

		service.addStudent(std);
		List<Student> students = service.getAllStudents();
		System.out.println(students);
	}

}
