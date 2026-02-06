package com.example.GeminiMovieExample.service;

import com.example.GeminiMovieExample.model.Movie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MovieServiceTest {

    @Test
    void addMovie_generatesDescription_andStoresMovie() {
        GeminiService geminiService = mock(GeminiService.class);
        when(geminiService.generateMovieDescription("The Matrix", 9))
                .thenReturn("AI description");

        MovieService movieService = new MovieService(geminiService);

        Movie created = movieService.addMovie("The Matrix", 9);

        assertEquals("The Matrix", created.getTitle());
        assertEquals(9, created.getRating());
        assertEquals("AI description", created.getDescription());
        assertEquals(1, movieService.getAllMovies().size());

        verify(geminiService, times(1))
                .generateMovieDescription("The Matrix", 9);
    }
}

