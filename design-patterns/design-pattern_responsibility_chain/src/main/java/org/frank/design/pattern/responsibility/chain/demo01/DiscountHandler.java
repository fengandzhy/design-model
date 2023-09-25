package org.frank.design.pattern.responsibility.chain.demo01;

public abstract class DiscountHandler {
    protected DiscountHandler successor; // 后继处理器

    public void setSuccessor(DiscountHandler successor) {
        this.successor = successor;
    }

    public abstract double applyDiscount(double purchaseAmount);
}
