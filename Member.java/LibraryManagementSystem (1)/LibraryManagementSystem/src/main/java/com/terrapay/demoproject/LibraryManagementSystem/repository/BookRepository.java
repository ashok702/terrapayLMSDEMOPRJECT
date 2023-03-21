package com.terrapay.demoproject.LibraryManagementSystem.repository;


import com.terrapay.demoproject.LibraryManagementSystem.model.TextBooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;

@Repository
public interface BookRepository extends JpaRepository<TextBooks,Long> {





    TextBooks findBytitle(String title);

}
