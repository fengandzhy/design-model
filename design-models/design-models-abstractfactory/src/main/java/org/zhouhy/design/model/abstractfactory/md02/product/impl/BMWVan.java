package org.zhouhy.design.model.abstractfactory.md02.product.impl;

import org.zhouhy.design.model.abstractfactory.md02.product.AbsBMW;

public class BMWVan extends AbsBMW {

    private final static String SEVENT_SEARIES = "7系列车型商务车";

    @Override
    public String getModel() {
        return SEVENT_SEARIES;
    }
}
