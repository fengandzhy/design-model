package org.zhouhy.design.model.abstractfactory.md01;

import org.zhouhy.design.model.abstractfactory.md01.factory.AbstractFactory;
import org.zhouhy.design.model.abstractfactory.md01.product.Cpu;
import org.zhouhy.design.model.abstractfactory.md01.product.MainBoard;

public class ComputerEngineer {

    public void makeComputer(AbstractFactory abstractFactory){
        Cpu cpu = abstractFactory.createCpu();
        MainBoard mainBoard = abstractFactory.createMainBorad();
        testHardware(cpu,mainBoard);
    }

    public void testHardware(Cpu cpu,MainBoard mainBoard){
        cpu.caculate();
        mainBoard.installCpu();
    }
}
