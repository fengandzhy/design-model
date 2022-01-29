package org.zhouhy.design.patterns.simple.factory.demo01.product.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zhouhy.design.patterns.simple.factory.demo01.product.Pizza;


public class MeatPizza extends Pizza {

    private static final Logger LOGGER = LoggerFactory.getLogger(Pizza.class);
    
    @Override
    public void prepare() {
        LOGGER.info("准备肉类");
    }

    @Override
    public void make() {
        LOGGER.info("制作肉类pizza");
    }

    @Override
    public void complete() {
        LOGGER.info("完成肉类pizza");
    }
}
