package com.polarbookshop.catalogservice.demo;

import com.polarbookshop.catalogservice.domain.Book;
import com.polarbookshop.catalogservice.persistence.BookRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("test-data")
public class BookDataLoader {

    private final BookRepository bookRepository;

    public BookDataLoader(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void loadData() {
        bookRepository.deleteAll();
        var book1 = Book.of("123456789", "What the helly", "Kudzi", 99.0,"Wiley");
        var book2 = Book.of("987654321", "What the helly Vol II", "Wadzi", 99.0,"Apress");
        bookRepository.saveAll(List.of(book1, book2));
    }
}
