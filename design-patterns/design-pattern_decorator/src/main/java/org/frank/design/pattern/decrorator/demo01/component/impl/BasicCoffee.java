package org.frank.design.pattern.decrorator.demo01.component.impl;

import org.frank.design.pattern.decrorator.demo01.component.Coffee;

public class BasicCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Basic coffee";
    }

    @Override
    public double cost() {
        return 2.00;
    }
}
