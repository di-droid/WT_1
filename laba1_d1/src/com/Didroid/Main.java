package com.Didroid.;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TaskFirst mainTask = new TaskFirst();

        System.out.println("Task 1: \n"+mainTask.L1T1(2,2));
        System.out.println();

        System.out.println("Task 2: \n"+mainTask.L1T2(4,2));
        System.out.println();

        System.out.println("Task 3: ");
        mainTask.L1T3(1,5,1);
        System.out.println();

        System.out.println("Task 4: ");
        mainTask.L1T4(10);
        System.out.println();
        System.out.println();

        System.out.println("Task 5: ");
        mainTask.L1T5();
        System.out.println();
        System.out.println();

        System.out.println("Task 6: ");
        mainTask.L1T6();
        System.out.println();

        System.out.println("Task 7: ");
        mainTask.L1T7();
        System.out.println();

        System.out.println("Task 8: ");
        mainTask.L1T8();
        System.out.println();
        System.out.println();

        System.out.println("Task 9: ");
        BallObj[] arrBalls = new BallObj[3];
        arrBalls[0] = new BallObj(2.3,"blue");
        arrBalls[1] = new BallObj(2.7,"blue");
        arrBalls[2] = new BallObj(3,"red");

        BasketObj basket = new BasketObj();
        System.out.println("Weight of balls: "+basket.GetWeight(arrBalls));
        System.out.println("Number of blue balls: "+basket.GetColor(arrBalls));
        System.out.println();

        System.out.println("Task 12: ");
        Book myBook = new Book("Water", "Di",19,0);
        System.out.println(myBook.equals(myBook));
        System.out.println(myBook.hashCode());
        System.out.println(myBook.toString());
        System.out.println();

        System.out.println("Task 13: ");
        ProgrammerBook lanBook = new ProgrammerBook("C++",5);
        System.out.println(lanBook.toString());
        System.out.println();

        System.out.println("Task 14: ");
        Book anotherBook = (Book) myBook.clone();
        System.out.println(anotherBook.toString());
        System.out.println(myBook.equals(anotherBook));
        System.out.println();

        System.out.println("Task 15: ");
        TreeSet<Book> myLibruary = new TreeSet<Book>();
        myLibruary.add(new Book("Paris", "Hellord ffff",43,2));
        myLibruary.add(new Book("Phone", "Podik",32,3));
        myLibruary.add(new Book("Samogon", "Angel",61,1));
        myLibruary.add(myBook);
        System.out.println("Libruary: "+myLibruary.size());
        for (Book Lib:myLibruary){
            System.out.println(Lib);
        }
        System.out.println();

        System.out.println("Task 16: ");
        System.out.println("Title and author: ");
        Comparator<Book> ATcomp = new Tcomp().thenComparing(new Acomp());
        TreeSet<Book> myLibruary2 = new TreeSet(ATcomp);
        myLibruary2.add(new Book("Paris", "Hellord ffff",43,2));
        myLibruary2.add(new Book("Phone", "Podik",32,3));
        myLibruary2.add(new Book("Samogon", "Angel",61,1));
        myLibruary2.add(myBook);
        for (Book Lib:myLibruary2){
            System.out.println(Lib);
        }

        System.out.println("Author and title: ");
        Comparator<Book> TAcomp = new Acomp().thenComparing(new Tcomp());
        TreeSet<Book> myLibruary3 = new TreeSet(TAcomp);
        myLibruary3.add(new Book("Paris", "Hellord ffff",43,2));
        myLibruary3.add(new Book("Phone", "Podik",32,3));
        myLibruary3.add(new Book("Samogon", "Angel",61,1));
        myLibruary3.add(myBook);
        for (Book Lib:myLibruary3){
            System.out.println(Lib);
        }

        System.out.println("Author, title and price: ");
        Comparator<Book> ATPcomp = new Acomp().thenComparing(new Tcomp().thenComparing(new Pcomp()));
        TreeSet<Book> myLibruary4 = new TreeSet(ATPcomp);
        myLibruary4.add(new Book("Paris", "Hellord ffff",43,2));
        myLibruary4.add(new Book("Phone", "Podik",32,3));
        myLibruary4.add(new Book("Samogon", "Angel",61,1));
        myLibruary4.add(myBook);
        for (Book Lib:myLibruary4){
            System.out.println(Lib);
        }
    }
}
