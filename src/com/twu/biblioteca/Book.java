package com.twu.biblioteca;

public class Book {

    private String title, author, year;

    public Book (String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }
    public String getYear() {
        return this.year;
    }

    public void printBook() {
        System.out.println(getTitle() + "   " + getAuthor() + "   " + getYear());
    }
}
