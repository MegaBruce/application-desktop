package com.picard.bibliotheque.mapper;

import com.picard.bibliotheque.model.Book;
import org.bson.Document;

import java.util.Date;

public class BookMapper {
    public static Document bookToDocument(Book book) {
        Document document = new Document()
                .append("name", book.getName())
                .append("writtenBy", book.getWrittenBy())
                .append("publishedDate", book.getPublishedDate())
                .append("pages", book.getPages());
        return document;
    }

    public static Book documentToBook(Document document) {
        Book book = new Book(
                (String) document.get("name"),
                (String) document.get("writtenBy"),
                (Date) document.get("publishedDate"),
                (int) document.get("page")
        );
        return book;
    }

}
