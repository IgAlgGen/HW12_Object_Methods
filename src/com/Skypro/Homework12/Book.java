package com.Skypro.Homework12;

import java.util.Objects;

public class Book {

    private final Author author;
    private final String bookTitle;
    private int yearOfPublishing;

    public Book(Author author, String bookTitle, int yearOfPublishing) {
        this.author = author;
        this.bookTitle = bookTitle;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getAuthor() {
        return author.getAuthorFullName();
    }

    @Override
    public String toString() {
        return author +" "+ bookTitle +" "+ yearOfPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublishing == book.yearOfPublishing && author.equals(book.author) && bookTitle.equals(book.bookTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookTitle, yearOfPublishing);
    }
}
