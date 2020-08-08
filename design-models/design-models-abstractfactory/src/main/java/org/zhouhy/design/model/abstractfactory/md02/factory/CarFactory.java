package org.zhouhy.design.model.abstractfactory.md02.factory;

import org.zhouhy.design.model.abstractfactory.md02.product.ICar;

public interface CarFactory {

    public ICar createSuv();

    public ICar createVan();
}
