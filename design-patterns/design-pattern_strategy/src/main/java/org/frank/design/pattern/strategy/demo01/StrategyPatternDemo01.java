package org.frank.design.pattern.strategy.demo01;

public class StrategyPatternDemo01 {
    public static void main(String[] args) {
        DiscountStrategy discountStrategy = new VIPDiscountStrategy();
        DiscountCalculator calculator = new DiscountCalculator();
        calculator.setDiscountStrategy(discountStrategy);
        System.out.println(calculator.calculateDiscount(100.00));
    }
}
