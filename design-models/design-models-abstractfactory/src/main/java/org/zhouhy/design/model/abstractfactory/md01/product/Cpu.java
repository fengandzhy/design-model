package org.zhouhy.design.model.abstractfactory.md01.product;

public abstract class Cpu {

    private int pins = 0;

    public Cpu(int pins){
        this.pins = pins;
    }

    public abstract void caculate();

    public int getPins() {
        return pins;
    }
}
