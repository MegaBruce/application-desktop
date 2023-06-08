package com.picard.bibliotheque.repository;

import com.mongodb.client.result.InsertOneResult;
import com.picard.bibliotheque.model.Book;

import java.util.List;

public interface BookRepository {
    String save(Book book);

    List<Book> getAll();
}
