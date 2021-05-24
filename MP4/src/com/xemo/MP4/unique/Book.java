package com.xemo.MP4.unique;


import java.util.*;

public class Book {
    private String name;
    private long isbn;
    public static Set<Long> isbns = new HashSet<>();
    public static Set<String> names = new HashSet<>();
    private int numberOfPages;
    private final static int MIN_NUMBER_OF_PAGES = 50;
    private final static int MAX_NUMBER_OF_PAGES = 1000;

    public Book(String name, long isbn, int numberOfPages) throws Exception {
        setName(name);
        setIsbn(isbn);
        setNumberOfPages(numberOfPages);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (names.contains(name)) {
            throw new Exception(String.format("Book with given name (%s) already exists!", name));
        }
        this.name = name;
        names.add(name);
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) throws Exception {
        if (isbns.contains(isbn)) {
            throw new Exception(String.format("Book with given ISBN (%s) already exists!", isbn));
        }
        this.isbn = isbn;
        isbns.add(isbn);
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    //static
    public void setNumberOfPages(int numberOfPages) throws Exception {
        if (numberOfPages < MIN_NUMBER_OF_PAGES) {
            throw new Exception(String.format("The book should have at least %s pages!", MIN_NUMBER_OF_PAGES));
        }
        if (numberOfPages > MAX_NUMBER_OF_PAGES) {
            throw new Exception(String.format("The book shouldn't have more than %s pages!", MAX_NUMBER_OF_PAGES));
        }
        this.numberOfPages = numberOfPages;
    }


    public static Set<Long> getIsbns() {
        return isbns;
    }

    public static void setIsbns(Set<Long> isbns) {
        Book.isbns = isbns;
    }

    public static int getMinNumberOfPages() {
        return MIN_NUMBER_OF_PAGES;
    }

    public static int getMaxNumberOfPages() {
        return MAX_NUMBER_OF_PAGES;
    }


//    FromExtend() {
//        for (Map.Entry<Long, Book> entry : getBooks().entrySet()) {
//            System.out.println(entry.getKey() + "->" + entry.getValue());
//        }
//    }
//
//    public static Book findBookByISBN(long isbn) {
//        for (Map.Entry<Long, Book> entry : getBooks().entrySet()) {
//            if (entry.getValue().getIsbn() == isbn) {
//                return entry.getValue();
//            }
//        }
//        return null;
//    }
//
//    public static void removeBookFromExtendedList(long isbn){
//        books.remove(isbn);
//    }
}
