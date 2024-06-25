package com.example.goodreads;

import java.util.ArrayList;
import com.example.goodreads.Book;

public interface BookRepository {
    ArrayList<Book> getBooks();
    Book getBookById(int bookId);

}
