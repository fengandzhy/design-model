package org.zhouhy.design.patterns.simple.factory;

import org.junit.Test;
import org.zhouhy.design.patterns.simple.factory.demo01.client.PizzaStore;

public class SimpleFactoryTest {
    
    @Test
    public void testDemo01(){
        PizzaStore store = new PizzaStore();
        store.orderPizza("meat");
    }
}
