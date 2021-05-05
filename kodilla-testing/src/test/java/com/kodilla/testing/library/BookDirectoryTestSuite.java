package com.kodilla.testing.library;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;

    }


    // public class BookDirectoryTestSuite {
     @Nested
     class BookWithCondition {



    @Test
    void testListBooksWithConditionsReturnList() {



        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());

    }

    // ctrl + alt + L - formatnie kodu
    @Test
    void testListBooksWithConditionMoreThan20() {
        //   assertTrue(false);

        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        List<Book> resultLIstOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);

        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOfBooks);

        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultLIstOf15Books);

        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("Title");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        //    Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());


    }


    @Test
    void testListBooksWithConditionFragmentShorterThan20() {

        assertTrue(false);
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

}
    @Test
    void testListBooksInHandsOf() {

        // Given
        BookLibrary bookLibrary =new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser0 =new LibraryUser("Kazimierz ", "Wielki ", "123456789");
        LibraryUser libraryUser1 =new LibraryUser("Iwan","Grożny", "987654321");
        LibraryUser libraryUser3 =new LibraryUser("Tomasz","Kamel","5433216897");

        List<Book> resultListOfBooks0 = new ArrayList<>();
        List<Book> resultListOfBooks1 =  generateListOfNBooks(1);
        List<Book>  resultListOfBooks2 = generateListOfNBooks(5);

        //When
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser0)).thenReturn(resultListOfBooks0);    //- chodziło Ci o to ? prawda ?
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(resultListOfBooks1);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser3)).thenReturn(resultListOfBooks2);

        List<Book> theListOfBooks0 =bookLibrary.listBooksInHandsOf(libraryUser0);
        List<Book> theListOfBooks1 =bookLibrary.listBooksInHandsOf(libraryUser1);
        List<Book> theListOfBooks5 =bookLibrary.listBooksInHandsOf(libraryUser3);

        //then
        assertEquals(0,theListOfBooks0.size());
        assertEquals(1,theListOfBooks1.size());
        assertEquals(5,theListOfBooks5.size());
    }
}



