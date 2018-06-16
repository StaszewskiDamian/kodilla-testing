package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //given
        Book book1 = new Book("tytul", "autor", LocalDate.of(1998, 6, 6));
        Library library1 = new Library("library1");
        //making shallow clone
        Library shallowCloneLibrary = null;
        try {
            shallowCloneLibrary = library1.shallowCopy();
            shallowCloneLibrary.setName("shallow cloned library1");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //making deep clone
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library1.deepCopy();
            deepCloneLibrary.setName("deep cloned library1");

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when
        library1.getBooks().add(book1);

        //then
        Assert.assertEquals(1, library1.getBooks().size());
        Assert.assertEquals(1, shallowCloneLibrary.getBooks().size());
        Assert.assertEquals(1, deepCloneLibrary.getBooks().size());
    }
}
