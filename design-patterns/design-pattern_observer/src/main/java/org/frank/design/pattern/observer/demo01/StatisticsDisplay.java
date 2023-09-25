package org.frank.design.pattern.observer.demo01;

public class StatisticsDisplay implements Observer{
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("统计数据更新");
    }
}
