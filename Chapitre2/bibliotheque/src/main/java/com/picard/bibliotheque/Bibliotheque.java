package com.picard.bibliotheque;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.picard.bibliotheque.model.Book;
import com.picard.bibliotheque.repository.BookRepositoryImpl;
import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class Bibliotheque {
    private static final Logger logger = LoggerFactory.getLogger(Bibliotheque.class);

    public static void main(String[] args) {
        String connectionString = "mongodb+srv://app-de-test:app-de-test@cluster0.jg9rphv.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            logger.info("Database connection successful");
            MongoDatabase database = mongoClient.getDatabase("myBibliotheque");
            MongoCollection<Document> booksCollection = database.getCollection("books");
            BookRepositoryImpl bookRepository = new BookRepositoryImpl(booksCollection);

            Book book = new Book(
                    "Une folle aventure",
                    "Jacques Marcel",
                    new Date(2001, 12, 3),
                    302
                    );
            logger.info("Book saved {}", bookRepository.save(book));
        } catch (Exception e) {
            logger.error("An error occurred during connection ==> {}", e);
        }
    }
}
