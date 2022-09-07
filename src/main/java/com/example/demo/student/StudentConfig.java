package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){

        return args -> {

                   Student Humayun = new Student(
                            "Humayun",
                            "mhumayun120@gmail.com",
                            LocalDate.of(1996,3,24)




            );

            Student Rakib = new Student(

                    "Rakib",
                    "newas1212@gmail.com",
                    LocalDate.of(1999,1,25)





            );

            repository.saveAll(
                    List.of(Humayun,Rakib)
            );

        };
    }
}
