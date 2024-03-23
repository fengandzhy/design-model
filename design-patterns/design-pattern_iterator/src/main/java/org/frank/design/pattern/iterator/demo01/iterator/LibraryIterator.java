package org.frank.design.pattern.iterator.demo01.iterator;

import org.frank.design.pattern.iterator.demo01.element.Book;

import java.util.List;

public class LibraryIterator implements Iterator<Book>{
    private List<Book> books;
    private int position = 0;
    
    public LibraryIterator(List<Book> books){
        this.books = books;
    }
    
    @Override
    public boolean hasNext() {
        return position < books.size();
    }

    @Override
    public Book next() {
        if (this.hasNext()) {
            return books.get(position++);
        }
        return null;
    }
}
