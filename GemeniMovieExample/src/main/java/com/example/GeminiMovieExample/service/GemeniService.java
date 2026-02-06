package com.example.GeminiMovieExample.service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

import org.springframework.stereotype.Service;

@Service
public class GeminiService {

    public String generateMovieDescription(String title, int rating) {
        GenerateContentResponse response =
                client.models.generateContent("gemini-2.0-flash-001", prompt, null);

        return response.text();
    }
}

