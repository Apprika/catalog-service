package com.polarbookshop.catalogservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class CatalogServiceApplicationTests {

    @Test
    void contextLoads() {
    }

//    @Test
//    void whenPostRequestThenBookCreated() {
//        var book = new Book("1234567890", "Title", "Author", 9.90);
//        webTestClient.post()
//                .uri("/books")
//                .bodyValue(book)
//                .exchange()
//                .expectStatus().isCreated()
//                .expectBody(Book.class).value(actualBook -> {
//                    assertThat(actualBook).isNotNull();
//                    assertThat(actualBook.isbn()).isEqualTo(book.isbn());
//                });
//    }


}
