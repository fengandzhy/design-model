package org.frank.design.pattern.decrorator.demo01;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 1.0; // 牛奶配料的价格
    }

    @Override
    public String description() {
        return super.description() + " with Milk";
    }
}
