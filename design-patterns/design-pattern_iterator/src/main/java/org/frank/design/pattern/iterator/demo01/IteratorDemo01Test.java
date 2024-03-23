package org.frank.design.pattern.iterator.demo01;

import org.frank.design.pattern.iterator.demo01.container.LibraryBookCollection;
import org.frank.design.pattern.iterator.demo01.element.Book;
import org.frank.design.pattern.iterator.demo01.iterator.Iterator;

public class IteratorDemo01Test {
    public static void main(String[] args) {
        LibraryBookCollection library = new LibraryBookCollection();
        library.addBook(new Book("Design Patterns"));
        library.addBook(new Book("Effective Java"));
        library.addBook(new Book("Clean Code"));

        Iterator<Book> iterator = library.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Book: " + book.getName());
        }
    }
}
