package com.picard.bibliotheque.repository;

import com.mongodb.client.result.InsertOneResult;
import com.picard.bibliotheque.model.Book;

public interface BookRepository {
    InsertOneResult save(Book book);
}
