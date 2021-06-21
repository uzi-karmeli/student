package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student uzi = new Student(
                    "Uzi",
                    "uzi.karmeli@gmail.com",
                    LocalDate.of(1978, Month.JANUARY, 27)
            );

            Student jotam = new Student(
                    "Jotam",
                    "jotam.karmeli@gmail.com",
                    LocalDate.of(2008, Month.JANUARY, 23)
            );

            studentRepository.saveAll(List.of(uzi, jotam));
        };
    }
}
