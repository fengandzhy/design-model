package org.frank.design.pattern.iterator.demo01.container;

import org.frank.design.pattern.iterator.demo01.element.Book;
import org.frank.design.pattern.iterator.demo01.iterator.Iterator;
import org.frank.design.pattern.iterator.demo01.iterator.LibraryIterator;

import java.util.ArrayList;
import java.util.List;

public class LibraryBookCollection implements BookCollection{
    private List<Book> books;
    
    public LibraryBookCollection(){
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }
    
    @Override
    public Iterator<Book> iterator() {
        return new LibraryIterator(books);
    }
}
