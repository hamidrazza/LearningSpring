package com.hamid.SpringJPA;

import com.hamid.SpringJPA.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJpaApplication.class, args);
		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		s1.setRollNo(101);
		s1.setName("Hamid");
		s1.setMarks(85);
		repo.save(s1);

		Student s2 = context.getBean(Student.class);
		s2.setRollNo(102);
		s2.setName("Mahi");
		s2.setMarks(92);
		repo.save(s2);

		Student s3 = context.getBean(Student.class);
		s3.setRollNo(103);
		s3.setName("Toheed");
		s3.setMarks(90);
		repo.save(s3);

//		System.out.println(repo.findAll());

//		Optional<Student> s = repo.findById(104);
//		System.out.println(s.orElse(new Student()));
	}

}
