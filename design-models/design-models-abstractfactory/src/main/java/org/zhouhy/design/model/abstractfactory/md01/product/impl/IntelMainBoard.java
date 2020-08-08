package org.zhouhy.design.model.abstractfactory.md01.product.impl;

import org.zhouhy.design.model.abstractfactory.md01.product.MainBoard;

public class IntelMainBoard extends MainBoard {


    public IntelMainBoard(int cpuHoles) {
        super(cpuHoles);
    }

    @Override
    public void installCpu() {
        System.out.println("Intel主板的CPU插槽孔数是：" + this.getCpuHoles());
    }
}
