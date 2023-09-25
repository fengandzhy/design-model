package org.frank.design.pattern.decrorator.demo01;

public class Latte implements Coffee{
    @Override
    public double cost() {
        return 3.0;
    }

    @Override
    public String description() {
        return "拿铁咖啡";
    }
}
