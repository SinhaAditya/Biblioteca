package com.twu.biblioteca;

import java.util.*;

public class Library {

    List<Book> books;
    List<Movie> movies;

    public Library() {
        books = new ArrayList<Book>();
        movies = new ArrayList<Movie>();
    }

    public void openConsole() {

        //displaying welcome message
        System.out.println("Welcome to Biblioteca. " +
                "Your one stop shop for great book titles in Bangalore!");
        System.out.println("============================");

        // creating a menu
        List<String> mainMenu = new ArrayList<String>();

        // adding menu items
        mainMenu.add("Enter 1 to view book list");
        mainMenu.add("Enter 2 to view movies collection");
        mainMenu.add("Enter 0 to exit");

        // taking user input
        Scanner choose = new Scanner(System.in);

        int choice = -1;

        while(choice != 0) {
            // printing main menu
            System.out.println("MAIN MENU");
            System.out.println("============================");
            for(String item: mainMenu) {
                System.out.println(item);
            }

            choice = Integer.parseInt(choose.next());

            switch(choice) {
                case 1:
                    this.printAllBooks();
                    break;

                case 2:
                    this.printAllMovies();
                    break;

                case 0:
                    System.out.println("Thank you for using Biblioteca. Exiting now...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        }
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void addMovie(Movie movie) { this.movies.add(movie); }

    public void printAllBooks() {

        System.out.println("BOOKS");
        System.out.println("============================");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(Integer.toString(i+1) + " " + books.get(i).printBook());
        }

        this.showBooksMenu();
    }

    public void printAllMovies() {
        System.out.println("MOVIES");
        System.out.println("============================");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(Integer.toString(i+1) + " " + movies.get(i).printMovie());
        }

        this.showMoviesMenu();
    }

    public void stockLibrary() {

        // adding books
        Book book  = new Book("Ramayana", "Valmeeki", "3000 BC");
        this.addBook(book);
        this.addBook(new Book("Mahabharata", "Ved Vyas", "1000 BC"));
        this.addBook(new Book("12 Rules for Life", "Jordan Peterson", "2018"));
        this.addBook(new Book("Les Miserables", "Victor Hugo", "1862"));

        // adding movies
        Movie movie = new Movie("Joker", "2019", "Todd Phillips", "9.3");
        this.addMovie(movie);
        this.addMovie(new Movie("Pulp Fiction", "1994", "Quentin Tarantino", "9.6"));
        this.addMovie(new Movie("Avengers: Infinity War", "2018", "Anthony Russo", "9.5"));
        this.addMovie(new Movie("Tenki no ko", "2019", "Makoto Shinkai", "9.8"));
    }

    public void showMoviesMenu() {

        Scanner choose = new Scanner(System.in);
        int choice = 0;

        while(choice != 2) {
            System.out.println("============================");
            System.out.println("Enter 1 to checkout a movie");
            System.out.println("Enter 2 to return to main menu");
            choice = Integer.parseInt(choose.next());

            switch(choice) {

                case 1:
                    System.out.println("MOVIE CHECKOUT");
                    System.out.println("============================");
                    System.out.println("Enter the Serial No for the movie you'd like to take: ");
                    choice = Integer.parseInt(choose.next());
                    if(choice > 0 && choice <= movies.size()) {
                        System.out.println("You've checked out: " + movies.get(choice-1).printMovie());
                        movies.remove(choice-1);
                        System.out.println("Thank you! Enjoy the movie");
                    } else {
                        System.out.println("Sorry, that movie is not available");
                    }
                    break;

                case 2:
                    return;

                default:
                    System.out.println("Invalid choice. Please enter again.");

            }
        }
    }

    public void showBooksMenu() {

        Scanner choose = new Scanner(System.in);
        int choice = 0;

        while(choice!= 3) {
            System.out.println("============================");
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
