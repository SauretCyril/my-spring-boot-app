package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/
@SpringBootApplication
public class MySpringBootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootAppApplication.class, args);
    }

    @RestController
    class HelloWorldController {

        @GetMapping("/")
        public String hello() {
            return "Hello World";
        }
    }
}