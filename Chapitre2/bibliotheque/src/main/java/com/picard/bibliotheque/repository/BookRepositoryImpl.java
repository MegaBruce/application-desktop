package com.picard.bibliotheque.repository;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.InsertOneResult;
import com.picard.bibliotheque.model.Book;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

import static com.picard.bibliotheque.mapper.BookMapper.bookToDocument;
import static com.picard.bibliotheque.mapper.BookMapper.documentToBook;

public class BookRepositoryImpl implements BookRepository{
    MongoCollection<Document> collection;
    public BookRepositoryImpl(MongoCollection<Document> collection){
        this.collection = collection;
    }
    @Override
    public String save(Book book) {
        InsertOneResult result = this.collection.insertOne(bookToDocument(book));
        return result.getInsertedId().toString();
    }

    @Override
    public List<Book> getAll() {
        List<Book> books = new ArrayList<Book>();
        for (Document document : this.collection.find()) {
            books.add(documentToBook(document));
        }
        return books;
    }
}
