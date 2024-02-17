package org.frank.design.pattern.observer.demo02.observer.impl;

import org.frank.design.pattern.observer.demo02.observer.Observer;

public class NewsReader implements Observer {
    private String name;

    public NewsReader(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news: "+news);
    }
}
