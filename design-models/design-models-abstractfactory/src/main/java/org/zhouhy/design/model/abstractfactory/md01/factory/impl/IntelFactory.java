package org.zhouhy.design.model.abstractfactory.md01.factory.impl;

import org.zhouhy.design.model.abstractfactory.md01.factory.AbstractFactory;
import org.zhouhy.design.model.abstractfactory.md01.product.Cpu;
import org.zhouhy.design.model.abstractfactory.md01.product.MainBoard;
import org.zhouhy.design.model.abstractfactory.md01.product.impl.IntelCpu;
import org.zhouhy.design.model.abstractfactory.md01.product.impl.IntelMainBoard;

public class IntelFactory implements AbstractFactory {

    private int pints;

    public IntelFactory(int pints){
        this.pints = pints;
    }

    @Override
    public MainBoard createMainBorad() {
        return new IntelMainBoard(pints);
    }

    @Override
    public Cpu createCpu() {
        return new IntelCpu(pints);
    }
}
