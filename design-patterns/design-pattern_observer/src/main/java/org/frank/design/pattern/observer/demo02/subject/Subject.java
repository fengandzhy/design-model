package org.frank.design.pattern.observer.demo02.subject;

import org.frank.design.pattern.observer.demo02.observer.Observer;

/**
 * 定义被观察者接口
 * */
public interface Subject {
    void registerObserver(Observer observer); // 注册侦听器
    void unregisterObserver(Observer observer); // 移除侦听器
    void notifyObservers();
}
