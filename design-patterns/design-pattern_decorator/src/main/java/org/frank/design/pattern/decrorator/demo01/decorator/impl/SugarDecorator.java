package org.frank.design.pattern.decrorator.demo01.decorator.impl;

import org.frank.design.pattern.decrorator.demo01.component.Coffee;
import org.frank.design.pattern.decrorator.demo01.decorator.AbstractDecorator;

public class SugarDecorator extends AbstractDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription()+", with sugar.";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 0.2;
    }
}
