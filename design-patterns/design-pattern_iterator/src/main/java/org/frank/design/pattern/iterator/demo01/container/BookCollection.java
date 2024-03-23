package org.frank.design.pattern.iterator.demo01.container;

import org.frank.design.pattern.iterator.demo01.element.Book;
import org.frank.design.pattern.iterator.demo01.iterator.Iterator;

public interface BookCollection {
    Iterator<Book> iterator();
}
