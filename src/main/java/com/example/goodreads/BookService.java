package com.example.goodreads;

import java.util.*;

import com.example.goodreads.Book;
import com.example.goodreads.BookRepository;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class BookService implements BookRepository {
    private HashMap<Integer, Book> hMap = new HashMap<>();

    public BookService() {

        Book b1 = new Book(1, "Harry potter", "1.img");
        Book b2 = new Book(2, "Harry potter", "1.img");

        hMap.put(b1.getId(), b1);
        hMap.put(b2.getId(), b2);

    }

    @Override
    public ArrayList<Book> getBooks() {
        Collection<Book> booksCollection = hMap.values();
        ArrayList<Book> books = new ArrayList<>(booksCollection);

        return books;
    }

    @Override
    public Book getBookById(int bookId) {
        Book book = hMap.get(bookId);
        if (book == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return book;
    }

}
