package org.frank.design.pattern.strategy.demo01;

public class PremiumDiscountStrategy implements DiscountStrategy{
    @Override
    public double calculateDiscount(double purchaseAmount) {
        return purchaseAmount * 0.2; // 20% 折扣
    }
}
