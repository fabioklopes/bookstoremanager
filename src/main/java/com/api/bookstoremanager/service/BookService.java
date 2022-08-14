package com.api.bookstoremanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.bookstoremanager.dto.MessageResponseDTO;
import com.api.bookstoremanager.entity.Book;
import com.api.bookstoremanager.repository.BookRepository;

@Service
public class BookService {
    
    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }



    public MessageResponseDTO create(Book book) {
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder()
                .message("Book created with ID #" + savedBook.getId())
                .build();
    }

    
}
