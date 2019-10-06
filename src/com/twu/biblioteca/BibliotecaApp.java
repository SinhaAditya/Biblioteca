package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        // displaying welcome message
        System.out.println("Welcome to Biblioteca. " +
                "Your one stop shop for great book titles in Bangalore!");
        System.out.println("============================");

        Library library = makeNewLibrary();

         /** menu-making could be a separate method altogether.
          * what follows is a temporary structure for the same.
          **/

        // creating a menu
        List<String> mainMenu = new ArrayList<String>();

        // adding menu items
        mainMenu.add("Enter 1 to view book list");
        mainMenu.add("Enter 2 to exit");

        // taking user input
        Scanner choose = new Scanner(System.in);

        int choice = 0;

        while(choice != 2) {
            // printing main menu
            System.out.println("MAIN MENU");
            System.out.println("============================");
            for(String item: mainMenu) {
                System.out.println(item);
            }

            choice = Integer.parseInt(choose.next());

            switch(choice) {
                case 1:
                    library.printAllBooks();
                    break;

                case 2:
                    System.out.println("Exiting Biblioteca");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        }


    }

    public static Library makeNewLibrary() {
        // creating a library
        Library library = new Library();

        // adding books to the library
        Book book  = new Book("Ramayana", "Valmeeki", "3000 BC");
        library.addBook(book);
        library.addBook(new Book("Mahabharata", "Ved Vyas", "1000 BC"));
        library.addBook(new Book("12 Rules for Life", "Dr. Peterson", "2018"));

        return library;
    }
}
