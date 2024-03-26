package org.frank.design.pattern.observer.demo01;

/**
 * 观察者模式（Observer Pattern）的主要作用是在对象之间建立一种一对多的依赖关系，
 * 使得当一个对象的状态发生改变时，所有依赖于它的对象都能够得到通知并自动更新。
 * */
public class ObserverPatternExample {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        weatherStation.registerObserver(currentDisplay);
        weatherStation.registerObserver(statisticsDisplay);

        // 模拟气象站更新数据
        weatherStation.measurementsChanged();
    }
}
