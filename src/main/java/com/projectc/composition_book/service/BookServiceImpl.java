package com.projectc.composition_book.service;

import com.projectc.composition_book.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class BookServiceImpl implements BookService {

    private final Map<String, Book> bookMap = new HashMap<>();

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(bookMap.values());
    }

    @Override
    public Book createBook(Book book) {
        bookMap.put(book.getTitle(), book);
        return book;
    }

    @Override
    public Book getBookByTitle(String title) {
        return bookMap.get(title);
    }

    @Override
    public Book updateBook(String title, Book updatedBook) {
        if (bookMap.containsKey(title)) {
            bookMap.put(title, updatedBook);
            return updatedBook;
        }
        else {
            System.out.println("Not available"+title);
        }
        return null;
    }

    @Override
    public void deleteBook(String title) {
        bookMap.remove(title);
    }
}
