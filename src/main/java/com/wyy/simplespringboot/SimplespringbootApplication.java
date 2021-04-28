package com.wyy.simplespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimplespringbootApplication {

    public static void main(String[] args) {
        System.out.println("模拟主分支冲突");
        SpringApplication.run(SimplespringbootApplication.class, args);
    }

}
