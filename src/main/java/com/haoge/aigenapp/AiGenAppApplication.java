package com.haoge.aigenapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.haoge.aigenapp.mapper")
public class AiGenAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiGenAppApplication.class, args);
    }

}
