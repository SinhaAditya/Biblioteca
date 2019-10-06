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

        System.out.println("BOOKS");
        System.out.println("============================");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(Integer.toString(i+1) + " " + books.get(i).printBook());
        }

        Scanner choose = new Scanner(System.in);
        int choice = 0;

        System.out.println("============================");

        while(choice!= 3) {

            System.out.println("Enter 1 to checkout a book");
            System.out.println("Enter 2 to return a book");
            System.out.println("Enter 3 to return to main menu");
            choice = Integer.parseInt(choose.next());

            switch(choice) {
                case 1:
                    System.out.println("BOOK CHECKOUT");
                    System.out.println("============================");
                    System.out.println("Enter the Serial No for the book you'd like to take: ");
                    choice = Integer.parseInt(choose.next());
                    if(choice > 0 && choice <= books.size()) {
                        System.out.println("You've checked out: " + books.get(choice).printBook());
                        books.remove(choice);
                        System.out.println("Thank you! Enjoy the book");
                    } else {
                        System.out.println("Sorry, that book is not available");
                    }
                    break;

                case 2:
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Invalid choice. Please enter again.");

            }
        }
    }
}
