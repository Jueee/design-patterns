package com.jueee.example02;

import java.util.ArrayList;
import java.util.List;

public class ExampleMain {
    
    public static Book getBook() {
        Book book = new Book();
        book.setAuthor("author");
        book.setDescription("description");
        book.setIsbn("isbn");
        book.setTitle("title");
        book.setReader_username("reader_username");
        return book;
    }
    
    public static List<Book> getBooks(int bookNum) {
        List<Book> books = new ArrayList<Book>();
        for (int i = 0; i < bookNum; i++) {
            Book book = new Book();
            book.setAuthor("author" + i);
            book.setDescription("description" + i);
            book.setIsbn("isbn" + i);
            book.setTitle("title" + i);
            book.setReader_username("reader_username" + i);
            books.add(book);
        }
        return books;
    }
    
    public static void main(String[] args) {
        AbstractMySQLExecute contrete1 = new BookMySQLExecute();
        try {
            contrete1.invoke(getBook());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
        AbstractMySQLExecute contrete2 = new BookBatchMySQLExecute();
        try {
            contrete2.invoke(getBooks(3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
