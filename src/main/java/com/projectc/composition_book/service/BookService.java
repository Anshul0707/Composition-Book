package com.projectc.composition_book.service;

import com.projectc.composition_book.model.Book;

import java.util.List;

public interface BookService {

    public List<Book> getAllBooks();

    public Book createBook(Book book);

    public Book getBookByTitle(String title);

    public Book updateBook(String title, Book updatedBook);

    public void deleteBook(String title);

}
