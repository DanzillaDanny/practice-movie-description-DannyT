package com.example.GemeniMovieExample.model;

public class Movie {
    private long id;
    private String title;
    private int rating;
    private String description;

    public Movie() {}

    public Movie(long id, String title, int rating, String description) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.description = description;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}

