package com.Didroid;

import java.util.Comparator;

public class Acomp implements Comparator<Book> {

    public int compare(Book a, Book b){
        return a.GetAuthor().compareTo(b.GetAuthor());
    }
}
