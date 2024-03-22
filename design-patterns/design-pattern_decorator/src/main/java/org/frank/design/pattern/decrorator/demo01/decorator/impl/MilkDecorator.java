package org.frank.design.pattern.decrorator.demo01.decorator.impl;

import org.frank.design.pattern.decrorator.demo01.component.Coffee;
import org.frank.design.pattern.decrorator.demo01.decorator.AbstractDecorator;

public class MilkDecorator extends AbstractDecorator {
    
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription()+", with milk.";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 0.5;
    }
}
