package com.haoke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.haoke.yang")
public class HaokeApplication {

    public static void main(String[] args) {

        SpringApplication.run(HaokeApplication.class, args);
    }

}
