package com.esmabeydili.lambdaExample;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(103,"PUSLU KITALAR ATLASINDA",200));
        books.add(new Book(101,"ZAMANIN KISA TARIHI",250));
        books.add(new Book(102,"GUN OLUR ASRA BEDEL",500));
        books.add(new Book(100,"CALIKUSU",400));
        books.add(new Book(104,"NAR AGACI",300));
        return  books;
    }

}
