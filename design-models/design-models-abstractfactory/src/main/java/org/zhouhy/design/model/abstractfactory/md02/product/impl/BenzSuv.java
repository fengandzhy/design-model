package org.zhouhy.design.model.abstractfactory.md02.product.impl;

import org.zhouhy.design.model.abstractfactory.md02.product.AbsBenz;

public class BenzSuv extends AbsBenz {

    private final static String G_SERIES = "G系列SUV";

    public String getModel() {
        return G_SERIES;
    }
}
