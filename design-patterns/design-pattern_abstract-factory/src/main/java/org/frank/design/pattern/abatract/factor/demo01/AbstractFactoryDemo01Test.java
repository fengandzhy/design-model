package org.frank.design.pattern.abatract.factor.demo01;

import org.frank.design.pattern.abatract.factor.demo01.client.Application;
import org.frank.design.pattern.abatract.factor.demo01.factory.impl.WindowsGuiFactory;

public class AbstractFactoryDemo01Test {

    public static void main(String[] args) {
        Application application = new Application(new WindowsGuiFactory());
        application.operate("Frank");
    }    
}
