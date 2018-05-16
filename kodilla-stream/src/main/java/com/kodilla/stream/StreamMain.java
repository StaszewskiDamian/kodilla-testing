package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
/*      BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);
*/
        //zadanie 7.3
        Forum forum = new Forum();
        //inicjuje stream
        Map<Integer, ForumUser> resultStringOfForumUsers = forum.getUserList().stream()
                //filtruje tylko meszczyzn
                .filter(forumUser -> forumUser.getSex() == 'm')
                //filtruje uzytkownikow majacych conajmniej 20 lat
                .filter(forumUser -> LocalDate.from(forumUser.getDob()).until(LocalDate.now(), ChronoUnit.YEARS) >= 20)
                //filtruje uzytkownikow majacych co najmniej 1 post
                .filter(forumUser -> forumUser.getPostPublished() >= 1)
                //przy pomocy kolektora tworzy mape par gdzie kluczem jest identyfikator
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));
        //wyswietla otrzymana mape
        resultStringOfForumUsers.entrySet().stream()
                .map(entry -> "Klucz: " + entry.getKey() + ": wartosc: " + entry.getValue())
                .forEach(System.out::println);
    }
}