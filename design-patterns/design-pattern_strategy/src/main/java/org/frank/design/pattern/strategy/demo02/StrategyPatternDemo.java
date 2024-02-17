package org.frank.design.pattern.strategy.demo02;

import org.frank.design.pattern.strategy.demo02.context.ShoppingCart;
import org.frank.design.pattern.strategy.demo02.strategy.impl.BankTransferPayment;
import org.frank.design.pattern.strategy.demo02.strategy.impl.CreditCardPayment;
import org.frank.design.pattern.strategy.demo02.strategy.impl.PayPalPayment;

import java.math.BigDecimal;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(new CreditCardPayment());
        shoppingCart.checkout(new BigDecimal("125.00"));

        shoppingCart = new ShoppingCart(new PayPalPayment());
        shoppingCart.checkout(new BigDecimal("195.00"));

        shoppingCart = new ShoppingCart(new BankTransferPayment());
        shoppingCart.checkout(new BigDecimal("390.00"));
    }
}
