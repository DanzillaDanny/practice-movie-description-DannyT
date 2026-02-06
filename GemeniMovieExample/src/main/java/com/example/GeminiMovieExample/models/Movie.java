package com.example.GeminiMovieExample.models;

public class Movie {
    private String title;
    private int rating;
    private String description;
    private String genre;
    private String director;

    public Movie(String title, int rating, String description, String genre, String director) {
        this.title = "";
        this.rating = 0;
        this.description = "";
        this.genre = "";
        this.director = "";


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getDirector() {
        return director;}
}

@Override
public String toString() {
    return
            "Title: " + title + newline +
                    "Rating: " + rating + newline;
    "Description: " + description + newline;
}

