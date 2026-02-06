package com.example.GeminiMovieExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeminiMovieExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeminiMovieExampleApplication.class, args);
        System.out.println("GeminiMovieExampleApplication started");
        System.out.println("Health Check: http://localhost:8080/api/movies/health");
        System.out.println("Ask Questions: POST http://localhost:8080/api/movies/ask");
    }
}

