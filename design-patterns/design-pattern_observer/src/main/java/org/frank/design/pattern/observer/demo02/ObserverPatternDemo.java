package org.frank.design.pattern.observer.demo02;

import org.frank.design.pattern.observer.demo02.observer.Observer;
import org.frank.design.pattern.observer.demo02.observer.impl.NewsReader;
import org.frank.design.pattern.observer.demo02.subject.impl.NewsAgency;

/**
 * 在这个示例中，NewsAgency是被观察者，负责管理观察者（这里是NewsReader对象）并在有新新闻时通知它们。
 * NewsReader是观察者，接收来自NewsAgency的新闻更新。当NewsAgency发布新新闻时，所有注册的NewsReader都会收到通知。
 * */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        Observer reader1 = new NewsReader("Frank");
        Observer reader2 = new NewsReader("Tom");
        
        newsAgency.registerObserver(reader1);
        newsAgency.registerObserver(reader2);
        
        newsAgency.publishNews("Java is coming.");
        
        newsAgency.unregisterObserver(reader2);

        newsAgency.publishNews(".Net is coming.");
    }
}
