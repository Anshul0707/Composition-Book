package com.projectc.composition_book.controller;
import com.projectc.composition_book.model.Book;
import com.projectc.composition_book.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class CompositionController {
    private final BookService bookService;

    public CompositionController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("/")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping("/")
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @GetMapping("/{title}")
    public Book getBookByTitle(@PathVariable String title) {
        return bookService.getBookByTitle(title);
    }

    @PutMapping("/{title}")
    public Book updateBook(@PathVariable String title, @RequestBody Book book) {
        return bookService.updateBook(title, book);
    }

    @DeleteMapping("/{title}")
    public void deleteBook(@PathVariable String title) {
        bookService.deleteBook(title);
    }
}
