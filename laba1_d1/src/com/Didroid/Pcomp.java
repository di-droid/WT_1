package com.Didroid;

import java.util.Comparator;

public class Pcomp implements Comparator<Book> {
    public int compare(Book a, Book b){

        if(a.GetPrice()> b.GetPrice())
            return 1;
        else if(a.GetPrice()< b.GetPrice())
            return -1;
        else
            return 0;
    }
}
