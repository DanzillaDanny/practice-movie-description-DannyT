package com.example.GeminiMovieExample.controllers;
import main.GeminiMovieExample.model.Movie;
import org.springframework.web.bind.annotation.*;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

import org.apache.http.HttpException;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final List<Movie> movies = new ArrayList<>();
    Client client;

    @GetMapping
    public List<Movie> getAllMovies() {
        return movies;
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        String descriptionRequest = ":" + movie.getTitle();
    }
}

