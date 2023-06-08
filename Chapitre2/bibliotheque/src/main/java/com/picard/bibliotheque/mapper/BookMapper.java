package com.picard.bibliotheque.mapper;

import com.picard.bibliotheque.model.Book;
import org.bson.Document;

public class BookMapper {
    public static Document bookToDocument(Book book) {
        Document document = new Document()
                .append("name", book.getName())
                .append("writtenBy", book.getWrittenBy())
                .append("publishedDate", book.getPublishedDate())
                .append("pages", book.getPages())
                ;
        return document;
    }
}
