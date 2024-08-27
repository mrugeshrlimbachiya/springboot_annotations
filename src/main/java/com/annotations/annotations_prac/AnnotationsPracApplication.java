package com.annotations.annotations_prac;

import myPack.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class AnnotationsPracApplication implements CommandLineRunner {

	@Autowired
	private Student student;
	@Autowired
	private Date date;

	@Autowired
	private Emp emp;

	@Autowired
	private Dog dog;

	public static void main(String[] args) {
		SpringApplication.run(AnnotationsPracApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.student.studying();
		this.emp.whatsYourName();

	}
}
