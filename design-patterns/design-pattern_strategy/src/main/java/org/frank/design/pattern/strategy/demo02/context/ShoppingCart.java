package org.frank.design.pattern.strategy.demo02.context;

import org.frank.design.pattern.strategy.demo02.strategy.PaymentStrategy;

import java.math.BigDecimal;

public class ShoppingCart {
    
    private PaymentStrategy paymentStrategy;
    
    public ShoppingCart(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    
    public void checkout(BigDecimal payment){
        this.paymentStrategy.pay(payment);
    }
}
