package com.polarbookshop.catalogservice;

import com.polarbookshop.catalogservice.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;

@JsonTest
public class BookJsonTests {

    @Autowired
    private JacksonTester<Book> json;

}
