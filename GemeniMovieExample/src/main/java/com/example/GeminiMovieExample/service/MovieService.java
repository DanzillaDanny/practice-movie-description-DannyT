package com.example.GeminiMovieExample.service;

import com.example.GemeniMovieExample.models.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class MovieService {

    private final GeminiService geminiService;
    private final List<Movie> movies = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong(1);

    public MovieService(GeminiService geminiService) {
        this.geminiService = geminiService;
    }

    public Movie addMovie(String title, int rating) {
        String description = geminiService.generateMovieDescription(title, rating);
        Movie movie = new Movie(idCounter.getAndIncrement(), title, rating, description);
        movies.add(movie);
        return movie;
    }

    public List<Movie> getAllMovies() {
        return movies;
    }
}

