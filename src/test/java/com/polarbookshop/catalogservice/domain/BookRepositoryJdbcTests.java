package com.polarbookshop.catalogservice.domain;


import com.polarbookshop.catalogservice.config.DataConfig;

import com.polarbookshop.catalogservice.persistence.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.jdbc.core.JdbcAggregateTemplate;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@Import(DataConfig.class)
@ActiveProfiles("integration")
public class BookRepositoryJdbcTests {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private JdbcAggregateTemplate aggregateTemplate;

//    @Test
//    void findBookByIsbnWhenExisting() {
//        var isbn = "123456789";
//        var book = Book.of(isbn, "Title", "Author", 19.90,"Wiley");
//        aggregateTemplate.insert(book);
//        Optional<Book> actualBook = bookRepository.findByIsbn(isbn);
//        assertThat(actualBook.isPresent()).isTrue();
//        assertThat(actualBook.get().isbn()).isEqualTo(book.isbn());
//    }
}
