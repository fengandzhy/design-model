package org.zhouhy.design.model.creator.md01.product.impl;

import org.zhouhy.design.model.creator.md01.product.ICar;

public class Car implements ICar {

    private String engine;
    private String wheel;

    public Car(String engine,String wheel){
        this.engine = engine;
        this.wheel = wheel;
    }

    @Override
    public String getWheel() {
        return null;
    }

    @Override
    public String getEngine() {
        return null;
    }

    @Override
    public String toString() {
        return "车的轮子是：" + wheel + "\n车的引擎是：" + engine;
    }
}
