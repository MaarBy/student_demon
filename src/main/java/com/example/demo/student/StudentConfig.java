package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args ->	{
			Student romek = new Student(
					"Roman", 
					"rety@tety.uk", 
					LocalDate.of(1976, Month.MAY, 6) 
					);
			Student pieron = new Student(
					"Piernik", 
					"polar@golar.cc", 
					LocalDate.of(1985, Month.JANUARY, 12) 
					);
			repository.saveAll(List.of(romek, pieron));
			
		};
	}
	
	
}
