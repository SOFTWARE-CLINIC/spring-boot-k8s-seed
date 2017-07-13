package com.danielpacak.seed.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World!";
    }

    @RequestMapping("/env")
    public Map<String, String> env() {
        return System.getenv();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
