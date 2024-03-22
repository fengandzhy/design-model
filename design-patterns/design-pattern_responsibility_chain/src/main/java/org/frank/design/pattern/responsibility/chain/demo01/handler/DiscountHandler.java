package org.frank.design.pattern.responsibility.chain.demo01.handler;

public abstract class DiscountHandler {
    protected DiscountHandler successor; // 后继处理器

    public void setSuccessor(DiscountHandler successor) {
        this.successor = successor;
    }

    public double applyDiscount(double purchaseAmount) {
        if (successor != null) {
            return successor.applyDiscount(purchaseAmount);
        }
        return purchaseAmount;
    }
}
