package org.zhouhy.design.model.abstractfactory.md01.product.impl;

import org.zhouhy.design.model.abstractfactory.md01.product.MainBoard;

public class AmdMainBoard extends MainBoard {

    public AmdMainBoard(int cpuHoles) {
        super(cpuHoles);
    }

    @Override
    public void installCpu() {
        System.out.println("AMD主板的CPU插槽孔数是：" + this.getCpuHoles());
    }
}
