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
        //insert test here
    }

}
