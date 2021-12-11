package com.Didroid;

import java.util.Comparator;

public class Tcomp implements Comparator<Book> {

    public int compare(Book a, Book b){
        return a.GetTitle().compareTo(b.GetTitle());
    }
}
