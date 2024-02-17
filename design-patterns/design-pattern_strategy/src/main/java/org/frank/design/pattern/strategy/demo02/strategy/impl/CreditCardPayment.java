package org.frank.design.pattern.strategy.demo02.strategy.impl;

import org.frank.design.pattern.strategy.demo02.strategy.PaymentStrategy;

import java.math.BigDecimal;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(BigDecimal payment) {
        System.out.println("Paying $" + payment + " using Credit Card.");
    }
}
