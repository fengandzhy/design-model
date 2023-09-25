package org.frank.design.pattern.decrorator.demo01;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5; // 糖配料的价格
    }

    @Override
    public String description() {
        return super.description() + " with Sugar";
    }
}
