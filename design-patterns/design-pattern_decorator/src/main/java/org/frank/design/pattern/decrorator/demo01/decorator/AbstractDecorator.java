package org.frank.design.pattern.decrorator.demo01.decorator;

import org.frank.design.pattern.decrorator.demo01.component.Coffee;

public abstract class AbstractDecorator implements Coffee {
    
    protected Coffee decoratedCoffee;;
    
    public AbstractDecorator(Coffee decoratedCoffee){
        this.decoratedCoffee = decoratedCoffee;
    }
    
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }
}
