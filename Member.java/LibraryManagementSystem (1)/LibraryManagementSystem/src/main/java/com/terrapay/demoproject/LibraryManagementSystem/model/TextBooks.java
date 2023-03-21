package com.terrapay.demoproject.LibraryManagementSystem.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TextBooks

{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long textbooksId;

    private String title;

    private String authors;

    private Long quantity;

    private Long price;

}
