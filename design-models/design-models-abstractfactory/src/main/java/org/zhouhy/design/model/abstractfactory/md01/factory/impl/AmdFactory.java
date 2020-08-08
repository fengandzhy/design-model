package org.zhouhy.design.model.abstractfactory.md01.factory.impl;

import org.zhouhy.design.model.abstractfactory.md01.factory.AbstractFactory;
import org.zhouhy.design.model.abstractfactory.md01.product.Cpu;
import org.zhouhy.design.model.abstractfactory.md01.product.MainBoard;
import org.zhouhy.design.model.abstractfactory.md01.product.impl.AmdCpu;
import org.zhouhy.design.model.abstractfactory.md01.product.impl.AmdMainBoard;

public class AmdFactory implements AbstractFactory {

    private int pins = 0;

    public AmdFactory(int pins){
        this.pins = pins;
    }

    @Override
    public MainBoard createMainBorad() {
        return new AmdMainBoard(pins);
    }

    @Override
    public Cpu createCpu() {
        return new AmdCpu(pins);
    }
}
