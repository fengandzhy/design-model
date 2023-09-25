package org.frank.design.pattern.observer.demo01;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        observers = new ArrayList<>();
    }
    
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    // 模拟气象站测量并更新数据
    public void measurementsChanged() {
        // 在实际应用中，这里会有真正的测量逻辑
        temperature = 25.0f;
        humidity = 60.0f;
        pressure = 101.2f;

        // 数据更新后通知观察者
        notifyObservers();
    }
}
