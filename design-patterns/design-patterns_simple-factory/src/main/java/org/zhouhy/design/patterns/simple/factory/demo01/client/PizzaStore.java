package org.zhouhy.design.patterns.simple.factory.demo01.client;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.zhouhy.design.patterns.simple.factory.demo01.factory.PizzaSimpleFactory;
import org.zhouhy.design.patterns.simple.factory.demo01.product.Pizza;

import java.util.Optional;

public class PizzaStore {

    private static final Logger LOGGER = LoggerFactory.getLogger(PizzaStore.class);

    /**
     * 作为客户端, 这里就是消费产品的过程. 工厂模式的特点就是对客户端隐藏了具体的产品的实现过程, 我这个产品怎么造的, 你客户端不用去过问
     * 暴露给客户端的只是这个factory
     * 
     * */
    public void orderPizza(String pizzaType) {
        LOGGER.info("客户开始订购pizza ");
        Optional<Pizza> pizzaOptional = PizzaSimpleFactory.createPizza(pizzaType);
        if (pizzaOptional.isPresent()) {
            Pizza pizza = pizzaOptional.get();
            pizza.prepare();
            pizza.make();
            pizza.complete();
        }
    }
}
