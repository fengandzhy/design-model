package org.zhouhy.factory.demo01.factory;

import org.zhouhy.factory.demo01.product.Pizza;

public interface PizzaFactory {
    
    Pizza createCookedPizza(String materials);
    
    Pizza createUncookedPizza();
}
