package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.Map;

public class MedianAdaptee implements BookStatistic {

    @Override
    public int avergePublicationYear(Map<BookSignature, Book> books) {
        Statistic statistic = new Statistic();
        return statistic.avergePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistic statistic = new Statistic();
        return statistic.medianPublicationYear(books);
    }

}
