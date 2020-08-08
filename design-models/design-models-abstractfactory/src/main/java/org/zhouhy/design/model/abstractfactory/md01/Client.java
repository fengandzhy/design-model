package org.zhouhy.design.model.abstractfactory.md01;

import org.zhouhy.design.model.abstractfactory.md01.factory.AbstractFactory;
import org.zhouhy.design.model.abstractfactory.md01.factory.impl.IntelFactory;

public class Client {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new IntelFactory(755);
        ComputerEngineer computerEngineer = new ComputerEngineer();
        computerEngineer.makeComputer(abstractFactory);
    }
}
