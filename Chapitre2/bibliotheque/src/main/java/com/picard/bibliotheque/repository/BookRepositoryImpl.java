package com.picard.bibliotheque.repository;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.InsertOneResult;
import com.picard.bibliotheque.model.Book;
import org.bson.Document;

import static com.picard.bibliotheque.mapper.BookMapper.bookToDocument;

public class BookRepositoryImpl implements BookRepository{
    MongoCollection<Document> collection;
    public BookRepositoryImpl(MongoCollection<Document> collection){
        this.collection = collection;
    }
    @Override
    public InsertOneResult save(Book book) {
        return this.collection.insertOne(bookToDocument(book));
    }
}
