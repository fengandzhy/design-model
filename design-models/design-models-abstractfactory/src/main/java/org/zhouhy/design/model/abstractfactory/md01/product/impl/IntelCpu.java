package org.zhouhy.design.model.abstractfactory.md01.product.impl;

import org.zhouhy.design.model.abstractfactory.md01.product.Cpu;

public class IntelCpu extends Cpu {

    public IntelCpu(int pins) {
        super(pins);
    }

    @Override
    public void caculate() {
        System.out.println("Intel CPU的针脚数：" + this.getPins());
    }
}
