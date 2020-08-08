package org.zhouhy.design.model.abstractfactory.md01.product.impl;

import org.zhouhy.design.model.abstractfactory.md01.product.Cpu;

public class AmdCpu extends Cpu {


    public AmdCpu(int pins) {
        super(pins);
    }

    @Override
    public void caculate() {
        System.out.println("AMD CPU的针脚数：" + this.getPins());
    }
}
