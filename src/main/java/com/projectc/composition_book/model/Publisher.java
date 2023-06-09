package com.projectc.composition_book.model;

import lombok.Data;

@Data
public class Publisher {

    private String Company;
    private String Since;
    private String Address;

    public Publisher(String company, String since, String address) {
        Company = company;
        Since = since;
        Address = address;
    }
}
