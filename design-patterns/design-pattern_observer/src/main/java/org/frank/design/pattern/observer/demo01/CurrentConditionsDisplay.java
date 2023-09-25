package org.frank.design.pattern.observer.demo01;

public class CurrentConditionsDisplay implements Observer{
    private float temperature;
    private float humidity;
    
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("当前条件：温度 " + temperature + "°C，湿度 " + humidity + "%");
    }
}
