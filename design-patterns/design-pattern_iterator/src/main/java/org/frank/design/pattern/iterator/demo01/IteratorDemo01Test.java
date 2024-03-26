package org.frank.design.pattern.iterator.demo01;

import org.frank.design.pattern.iterator.demo01.container.LibraryBookCollection;
import org.frank.design.pattern.iterator.demo01.element.Book;
import org.frank.design.pattern.iterator.demo01.iterator.Iterator;

/**
 * 迭代器模式（Iterator Pattern）是一种常用的设计模式，属于行为型模式。它主要用于顺序访问一个集合中的元素，而无需暴露该对象的内部表示。
 * 迭代器模式通过提供一个统一的接口来遍历各种类型的数据集合（如数组、列表、树结构等），使得使用者不需要知道集合内部的结构和元素的存储方式，
 * 就能够依次访问集合中的每个元素。
 * */
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
