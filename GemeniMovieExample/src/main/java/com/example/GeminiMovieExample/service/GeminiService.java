package com.example.GeminiMovieExample.service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GeminiService {

    private static final Logger log = LoggerFactory.getLogger(GeminiService.class);

    private final Client client;

    public GeminiService(@Value("${gemini.api.key:}") String apiKey) {
        if (apiKey == null || apiKey.isBlank()) {
            throw new IllegalStateException("gemini.api.key is missing");
        }
        this.client = new Client.Builder().apiKey(apiKey).build();
    }

    public String getMovieInformation(String question) {
        try {
            if (question == null || question.trim().isEmpty()) {
                return "Error: Question cannot be empty";
            }

            String enhancedPrompt =
                    "You are a movie expert assistant. " +
                            "Answer the following question about movies: " + question;

            log.info("Calling Gemini AI with question: {}", question);

            GenerateContentResponse response =
                    client.models.generateContent("gemini-2.0-flash", enhancedPrompt, null);

            // In this SDK, it's response.text()
            return response.text();

        } catch (Exception e) {
            log.error("Error calling Gemini AI: ", e);
            return "Error: Failed to get movie information - " + e.getMessage();
        }
    }
}


