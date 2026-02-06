package com.example.GeminiMovieExample.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @GetMapping("/health")
    public String healthCheck() {
        return "Movie app is running";
    }

    @PostMapping("/ask")
    public String askAboutMovie(@RequestBody String question) {
        try {
            Client client = new Client();
            String movieQuestion = "You are a movie expert. Answer this question: " + question;

            GenerateContentResponse response = client.models.generateContent(
                    "gemini-2.0-flash-001",
                    movieQuestion,
                    null
            );

            return response.text();

        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}

