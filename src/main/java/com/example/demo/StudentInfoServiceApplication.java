package com.example.demo;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentInfoServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentInfoServiceApplication.class, args);
    }
    @Bean
    public CommandLineRunner init(StudentRepository studentRepository) {
        return args -> {
           studentRepository.save(new Student(null,"Juan Pérez", 20));
            studentRepository.save(new Student(null,"Ana Gómez", 22));
            studentRepository.save(new Student(null,"Carlos Ruiz", 19));
       };
   }

}
