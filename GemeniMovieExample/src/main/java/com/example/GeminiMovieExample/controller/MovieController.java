package com.example.GeminiMovieExample.controller;

import com.example.GemeniMovieExample.dto.CreateMovieRequest;
import com.example.GemeniMovieExample.models.Movie;
import com.example.GemeniMovieExample.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public Movie createMovie(@RequestBody CreateMovieRequest request) {
        return movieService.addMovie(request.getTitle(), request.getRating());
    }

    @GetMapping
    public List<Movie> getMovies() {
        return movieService.getAllMovies();
    }
}

