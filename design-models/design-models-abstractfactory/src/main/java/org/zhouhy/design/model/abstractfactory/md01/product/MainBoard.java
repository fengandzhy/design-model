package org.zhouhy.design.model.abstractfactory.md01.product;

public abstract class MainBoard {

    private int cpuHoles = 0;

    public MainBoard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }

    public abstract void installCpu();

    public int getCpuHoles() {
        return cpuHoles;
    }
}
