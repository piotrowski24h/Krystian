package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {

    List<Book> listBooksWithCondition(String titleFragment);

    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    //List<Book> listBooksInHandsOf(LibraryDatabaseMock libraryDatabaseMock);

    boolean rentABook(LibraryUser libraryUser, Book book);


    int returnBooks(LibraryUser libraryUser);
}
