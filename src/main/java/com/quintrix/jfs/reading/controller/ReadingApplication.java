package com.quintrix.jfs.reading.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.quintrix.jfs.reading.service.BookService;
import reactor.core.publisher.Mono;

@RestController
@SpringBootApplication
public class ReadingApplication {

    @Autowired
    private BookService bookService;

    @RequestMapping("/read")
    public Mono<String> toRead() {
        return bookService.readingList();
    }

    public static void main(String[] args) {
        SpringApplication.run(ReadingApplication.class, args);
    }
}
