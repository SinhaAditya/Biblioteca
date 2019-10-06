package com.twu.biblioteca;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ExampleTest {

    Book testBook = new Book("Ramayana", "Valmeeki", "3000 BCE");

    @Test
    public void testBookGetTitle() {
        assertThat(testBook.getTitle(), is(equalTo("Ramayana")));
    }

    @Test
    public void testBookGetAuthor() {
        assertThat(testBook.getAuthor(), is(equalTo("Valmeeki")));
    }

    @Test
    public void testBookGetYear() {
        assertThat(testBook.getYear(), is(equalTo("3000 BCE")));
    }

    @Test
    public void testBookPrintBook() {
        // on making a book with known values, it should print those same specified values always
    }

    @Test
    public void testLibraryAddBook() {

    }

    @Test
    public void testBookConstructor() {

    }

    @Test
    public void testLibraryConstructor(){

    }

    @Test
    public void testMakeNewLibrary() {
        // given a list of books, does makeNewLibrary return a library containing those books
        // potentially change makeNewLibrary() to take List<Book> as input
        // and make a separate method to generate a sample list of books
    }

}
