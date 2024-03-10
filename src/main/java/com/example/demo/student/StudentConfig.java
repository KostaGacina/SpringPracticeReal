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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

                    Student kosta = new Student(
                            "Kosta",
                            LocalDate.of(2003, Month.MAY,20),
                            "kosta.gacina@gmail.com"
                    );
                    Student ilija = new Student(
                            "Ilija",
                            LocalDate.of(2011, Month.APRIL,15),
                            "ilija.gacina@gmail.com"
                    );

                    repository.saveAll(List.of(kosta,ilija));
        };
    }
}
