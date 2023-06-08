package com.picard.bibliotheque.controller;

import com.picard.bibliotheque.model.Book;
import com.picard.bibliotheque.repository.BookRepository;

public class BookControllerImpl implements BookController{
    BookRepository bookRepository;
    public BookControllerImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    @Override
    public String saveBook(Book book) {
        return this.bookRepository.save(book);
    }
}
