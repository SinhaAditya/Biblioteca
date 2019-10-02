package com.twu.biblioteca;

import java.util.*;

public class Library {

    List<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void printAllBooks() {
        for (Book book: this.books) {
            book.printBook();
        }
    }
}
