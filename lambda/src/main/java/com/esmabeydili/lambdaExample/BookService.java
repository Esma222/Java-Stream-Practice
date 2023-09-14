package com.esmabeydili.lambdaExample;

import java.util.Collections;
import java.util.List;

public class BookService {

    //( b1, b2 )-> {
    // return b2.getName().compareTo(b1.getName());// OR b1.getName().compareTo(b2.getName());
    // }

    public List<Book> getBooksInSort(){
        List<Book> books = new BookDAO().getBooks();
        Collections.sort(books,(b1,b2)-> {return b1.getName().compareTo(b2.getName());});
        return  books;

    }

   /* public List<Book> getBooksInSort(){
        List<Book> books = new BookDAO().getBooks();
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b2.getName().compareTo(b1.getName());
            }
        });
        return  books;

    }*/
    public static void main(String[] args) {
        System.out.println(new BookService().getBooksInSort());
    }

}
/*

class MyComparator implements Comparator<Book>{
    @Override
    public int compare(Book b1, Book b2) {
        return b2.getName().compareTo(b1.getName());// OR b1.getName().compareTo(b2.getName());
    }
}
*/
