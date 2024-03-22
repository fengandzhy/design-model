package org.frank.design.pattern.decrorator.demo01;

import org.frank.design.pattern.decrorator.demo01.component.Coffee;
import org.frank.design.pattern.decrorator.demo01.component.impl.BasicCoffee;
import org.frank.design.pattern.decrorator.demo01.decorator.impl.MilkDecorator;
import org.frank.design.pattern.decrorator.demo01.decorator.impl.SugarDecorator;

public class DecoratorDemo01Test {

    public static void main(String[] args) {
        Coffee basicCoffee = new BasicCoffee();
        System.out.println(basicCoffee.getDescription() + " $" + basicCoffee.cost());

        Coffee milkCoffee = new MilkDecorator(new BasicCoffee());
        System.out.println(milkCoffee.getDescription() + " $" + milkCoffee.cost());

        Coffee fancyCoffee = new SugarDecorator(new MilkDecorator(new BasicCoffee()));
        System.out.println(fancyCoffee.getDescription() + " $" + fancyCoffee.cost());
    }
}
