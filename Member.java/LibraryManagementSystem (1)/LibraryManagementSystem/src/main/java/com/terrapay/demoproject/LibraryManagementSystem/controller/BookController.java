package com.terrapay.demoproject.LibraryManagementSystem.controller;


import com.terrapay.demoproject.LibraryManagementSystem.error.TextBookNotFoundException;
import com.terrapay.demoproject.LibraryManagementSystem.model.TextBooks;
import com.terrapay.demoproject.LibraryManagementSystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController

{

    @Autowired
    private BookService bookService;

    @PostMapping("/books")
    public TextBooks saveBook(@RequestBody TextBooks textBooks)

    {

        return bookService.saveBook(textBooks);

    }


    @GetMapping("/books")
    public List<TextBooks> fetchTextBooksList()

    {

        return bookService.fetchTextBooksList();


    }


    @GetMapping("/books/{id}")
    public Optional<TextBooks> fetchTextBooksById(@PathVariable("id") Long textbooksId) throws TextBookNotFoundException {
        return bookService.fetchTextBooksById(textbooksId);
    }

    @DeleteMapping("/books/{id}")
    public String deleteBookById(@PathVariable("id") Long bookId)

    {

        bookService.deleteBookById(bookId);

        return "BOOK deleted successfully";
    }


    @PutMapping("/books/{textbooksId}")
    public TextBooks updateTextBooks(@PathVariable("textbooksId") Long textbooksId, @RequestBody TextBooks textBooks)

    {

        return bookService.updateTextBooks(textbooksId, textBooks);


    }



    @GetMapping("/books/name/{title}")
    public TextBooks fetchTextBooksByName(@PathVariable("title") String title)

    {
        return bookService.fetchTextBooksByName(title);

    }







}
