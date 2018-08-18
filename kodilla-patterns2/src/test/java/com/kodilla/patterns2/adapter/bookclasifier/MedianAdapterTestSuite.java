package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book = new Book("King", "Tower", 1997, "PWN");
        Book book1 = new Book("dotCom", "Theories", 1998, "nieznany");
        Book book2 = new Book("Joanna", "Red dress", 2000, "UW");
        Book book3 = new Book("Damian", "Success", 2018, "mkUltra");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book);
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        MedianAdapter medianAdapter = new MedianAdapter();
        // When
        int publicationYearMedian = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(2000, publicationYearMedian);
    }
}