package org.frank.design.pattern.strategy.demo02.strategy;

import java.math.BigDecimal;

public interface PaymentStrategy {
    void pay(BigDecimal payment);
}
