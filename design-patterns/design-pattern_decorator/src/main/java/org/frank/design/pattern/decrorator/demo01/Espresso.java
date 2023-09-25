package org.frank.design.pattern.decrorator.demo01;

// 具体咖啡类：浓缩咖啡
public class Espresso implements Coffee {

    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public String description() {
        return "浓缩咖啡";
    }
}
