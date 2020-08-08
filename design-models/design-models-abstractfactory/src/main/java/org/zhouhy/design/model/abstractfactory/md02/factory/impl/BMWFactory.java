package org.zhouhy.design.model.abstractfactory.md02.factory.impl;

import org.zhouhy.design.model.abstractfactory.md02.factory.CarFactory;
import org.zhouhy.design.model.abstractfactory.md02.product.ICar;
import org.zhouhy.design.model.abstractfactory.md02.product.impl.BMWSuv;
import org.zhouhy.design.model.abstractfactory.md02.product.impl.BMWVan;

public class BMWFactory  implements CarFactory {

    @Override
    public ICar createSuv() {
        return new BMWSuv();
    }

    @Override
    public ICar createVan(){
        return new BMWVan();
    }
}
