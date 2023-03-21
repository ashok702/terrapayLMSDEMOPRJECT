package com.terrapay.demoproject.LibraryManagementSystem.service;

import com.terrapay.demoproject.LibraryManagementSystem.error.TextBookNotFoundException;
import com.terrapay.demoproject.LibraryManagementSystem.model.TextBooks;
import com.terrapay.demoproject.LibraryManagementSystem.repository.BookRepository;

import java.util.List;
import java.util.Optional;

public interface BookService

{




      public List<TextBooks> fetchTextBooksList();


      public TextBooks saveBook(TextBooks textBooks);


      public Optional<TextBooks> fetchTextBooksById(Long textbooksId) throws TextBookNotFoundException;

      public void deleteBookById(Long textbooksId);

    public TextBooks updateTextBooks(Long textbooksId, TextBooks textBooks);


    public TextBooks fetchTextBooksByName(String title);

}
