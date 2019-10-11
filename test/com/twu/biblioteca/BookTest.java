package com.twu.biblioteca;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BookTest {

    Book testBook = new Book("Ramayana", "Valmeeki", "3000 BCE");

    @Test
    public void testGetTitle() {
        assertThat(testBook.getTitle(), is(equalTo("Ramayana")));
    }

    @Test
    public void testGetAuthor() {
        assertThat(testBook.getAuthor(), is(equalTo("Valmeeki")));
    }

    @Test
    public void testGetYear() {
        assertThat(testBook.getYear(), is(equalTo("3000 BCE")));
    }

    @Test
    public void testPrintBook() {
        // on making a book with known values, it should print those same specified values always
    }

}
