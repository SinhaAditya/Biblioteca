package com.twu.biblioteca;

public class Movie {

    private String name, year, director, rating;

    public Movie (String name, String year, String director, String rating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public String getName() {
        return this.name;
    }

    public String getYear() {
        return this.year;
    }

    public String getDirector() {
        return this.director;
    }

    public String getRating() { return this.rating; }

    public String printMovie() {
        return (getName() + "   " + getYear() + "   " + getDirector() + "   " + getRating());
    }
}
