package org.zhouhy.design.patterns.simple.factory.demo01.product.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zhouhy.design.patterns.simple.factory.demo01.product.Pizza;

public class VegetablePizza extends Pizza {

    private static final Logger LOGGER = LoggerFactory.getLogger(VegetablePizza.class);
    
    @Override
    public void prepare() {
        LOGGER.info("准备蔬菜");
    }

    @Override
    public void make() {
        LOGGER.info("制作蔬菜pizza");
    }

    @Override
    public void complete() {
        LOGGER.info("完成蔬菜pizza");
    }
}
