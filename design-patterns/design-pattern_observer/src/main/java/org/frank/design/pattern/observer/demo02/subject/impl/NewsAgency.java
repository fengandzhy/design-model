package org.frank.design.pattern.observer.demo02.subject.impl;

import org.frank.design.pattern.observer.demo02.observer.Observer;
import org.frank.design.pattern.observer.demo02.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String latestNews;
    
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observers){
            o.update(latestNews);
        }
    }
    
    public void publishNews(String news){
        this.latestNews = news;
        this.notifyObservers();
    }
}
