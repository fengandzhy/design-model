package org.zhouhy.design.model.abstractfactory.md02.factory.impl;

import org.zhouhy.design.model.abstractfactory.md02.factory.CarFactory;
import org.zhouhy.design.model.abstractfactory.md02.product.ICar;
import org.zhouhy.design.model.abstractfactory.md02.product.impl.BenzSuv;
import org.zhouhy.design.model.abstractfactory.md02.product.impl.BenzVan;

public class BenzFactory implements CarFactory {

    @Override
    public ICar createSuv() {
        return new BenzSuv();
    }

    @Override
    public ICar createVan(){
        return new BenzVan();
    }
}
