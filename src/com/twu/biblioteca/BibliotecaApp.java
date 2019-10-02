package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        Book book  = new Book("Ramayana", "Valmeeki", "3000 BC");

        Library library = new Library();
        library.addBook(book);
        library.addBook(new Book("Mahabharata", "Ved Vyas", "1000 BC"));
        library.addBook(new Book("12 Rules for Life", "Dr. Peterson", "2018"));
        library.printAllBooks();

        System.out.println("Welcome to Biblioteca. " +
                "Your one stop shop for great book titles in Bangalore!");


    }
}
