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
        System.out.println("============================");

        this.showBooksMenu();
    }

    public void stockLibrary() {
        Book book  = new Book("Ramayana", "Valmeeki", "3000 BC");
        this.addBook(book);
        this.addBook(new Book("Mahabharata", "Ved Vyas", "1000 BC"));
        this.addBook(new Book("12 Rules for Life", "Jordan Peterson", "2018"));
        this.addBook(new Book("Les Miserables", "Victor Hugo", "1862"));
    }

    public void showBooksMenu() {

        Scanner choose = new Scanner(System.in);
        int choice = 0;

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
                        System.out.println("You've checked out: " + books.get(choice-1).printBook());
                        books.remove(choice-1);
                        System.out.println("Thank you! Enjoy the book");
                    } else {
                        System.out.println("Sorry, that book is not available");
                    }
                    break;

                case 2:

                    System.out.println("BOOK RETURN");
                    System.out.println("============================");

                    Scanner scanner = new Scanner(System.in);

                    System.out.println("Enter book title: ");
                    String title = scanner.nextLine();

                    System.out.println("Enter author's name: ");
                    String author = scanner.nextLine();

                    System.out.println("Enter year of publication: ");
                    String year = scanner.nextLine();

                    int size_before = books.size();

                    this.addBook(new Book(title, author, year));

                    int size_after = books.size();

                    if (size_after > size_before)
                        System.out.println("Thank you for returning the book");
                    else
                        System.out.println("That is not a valid book to return");

                    break;

                case 3:
                    return;

                default:
                    System.out.println("Invalid choice. Please enter again.");

            }
        }
    }
}
