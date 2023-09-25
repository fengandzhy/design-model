package org.frank.design.pattern.strategy.demo01;

public class RegularDiscountStrategy implements DiscountStrategy{
    @Override
    public double calculateDiscount(double purchaseAmount) {
        return purchaseAmount * 0.1; // 10% 折扣
    }
}
