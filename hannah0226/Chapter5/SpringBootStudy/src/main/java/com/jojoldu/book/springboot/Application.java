package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //jpa auditing 활성화
@SpringBootApplication
public class Application {
    public static void main(String[] arg){
        SpringApplication.run(Application.class, arg);
    }
}