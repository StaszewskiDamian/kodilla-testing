package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.Map;

public interface BookStatistic {

    int avergePublicationYear(Map<BookSignature, Book> books);

    int medianPublicationYear(Map<BookSignature, Book> books);

}
