package org.frank.design.pattern.strategy.demo01;

public class VIPDiscountStrategy implements DiscountStrategy{
    @Override
    public double calculateDiscount(double purchaseAmount) {
        return purchaseAmount * 0.3; // 30% 折扣
    }
}
