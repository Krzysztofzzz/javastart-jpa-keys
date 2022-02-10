package com.javastart;

import com.javastart.model.Book;
import com.javastart.repositories.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JavastartJpaKeysApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(JavastartJpaKeysApplication.class, args);
        BookRepository bookRepository = context.getBean(BookRepository.class);
        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", "Greg", 2002, 312);
        bookRepository.save(book1);
        Book book2 = new Book("Wilk z Wallstreet", "Jordan Belfort", "Świat Książki", 2014, 512);
        bookRepository.save(book2);
    }

}
