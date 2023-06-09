package com.projectc.composition_book.model;

import lombok.Data;

import java.util.List;

@Data
public class Book {

    private String title;
    private List<Author> authors;
    private Publisher publisher;
}
