package com.terrapay.demoproject.LibraryManagementSystem.service;


import com.terrapay.demoproject.LibraryManagementSystem.error.TextBookNotFoundException;
import com.terrapay.demoproject.LibraryManagementSystem.model.TextBooks;
import com.terrapay.demoproject.LibraryManagementSystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class BookServiceImpl implements BookService

{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<TextBooks> fetchTextBooksList()

    {

        return bookRepository.findAll();

    }

    @Override
    public TextBooks saveBook(TextBooks textBooks)

    {

        return bookRepository.save(textBooks);

    }

    @Override
    public Optional<TextBooks> fetchTextBooksById(Long textbooksId) throws TextBookNotFoundException {

        Optional<TextBooks> textBooks=bookRepository.findById(textbooksId);


        if(!textBooks.isPresent())
        {
            throw  new TextBookNotFoundException("TextBook is not available");
        }

        return Optional.of(textBooks.get());



    }

    @Override
    public void deleteBookById(Long textbooksId)

    {
        bookRepository.deleteById(textbooksId);

    }

    @Override
    public TextBooks updateTextBooks(Long textbooksId, TextBooks textBooks)

    {

        TextBooks bookDB=bookRepository.findById(textbooksId).get();

        if(Objects.nonNull(textBooks.getTitle())  && !"".equalsIgnoreCase(textBooks.getTitle()))

        {

            bookDB.setTitle(textBooks.getTitle());


        }


        if(Objects.nonNull(textBooks.getAuthors())  && !"".equalsIgnoreCase(textBooks.getAuthors()))

        {

            bookDB.setAuthors(textBooks.getAuthors());
        }


        if(Objects.nonNull(textBooks.getQuantity())  && !"".equalsIgnoreCase(String.valueOf(textBooks.getQuantity())))

        {

            bookDB.setQuantity(textBooks.getQuantity());
        }

        if(Objects.nonNull(textBooks.getPrice())  && !"".equalsIgnoreCase(String.valueOf(textBooks.getPrice())))

        {

            bookDB.setPrice(textBooks.getPrice());
        }

        return bookRepository.save(bookDB);
    }

    @Override
    public TextBooks fetchTextBooksByName(String title)

    {

        return bookRepository.findBytitle(title);

    }


}
