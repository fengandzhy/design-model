package org.zhouhy.design.model.abstractfactory.md02.product.impl;

import org.zhouhy.design.model.abstractfactory.md02.product.AbsBMW;

public class BMWSuv extends AbsBMW {

    private final static String X_SEARIES = "X系列车型SUV";

    public String getModel() {
        return X_SEARIES;
    }
}
