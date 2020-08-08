package org.zhouhy.design.model.abstractfactory.md01.factory;

import org.zhouhy.design.model.abstractfactory.md01.product.Cpu;
import org.zhouhy.design.model.abstractfactory.md01.product.MainBoard;


/**
 * 抽象工厂里面的方法是用来创建一堆产品,这些产品都是彼此有联系的,它们属于一族的产品
 *
 * */
public interface AbstractFactory {

    public MainBoard createMainBorad();

    public Cpu createCpu();
}
