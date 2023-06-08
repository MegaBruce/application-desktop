package com.picard.bibliotheque.model;

import java.util.Date;

public class Book {
    public Book(String name, String writtenBy, Date publishedDate, int pages) {
        this.name = name;
        this.writtenBy = writtenBy;
        this.publishedDate = publishedDate;
        this.pages = pages;
    }
    private String name;
    private String writtenBy;
    private Date publishedDate;
    private int pages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWrittenBy() {
        return writtenBy;
    }

    public void setWrittenBy(String writtenBy) {
        this.writtenBy = writtenBy;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
