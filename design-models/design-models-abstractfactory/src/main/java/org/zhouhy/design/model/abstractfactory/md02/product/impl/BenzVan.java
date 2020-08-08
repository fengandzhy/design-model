package org.zhouhy.design.model.abstractfactory.md02.product.impl;

import org.zhouhy.design.model.abstractfactory.md02.product.AbsBenz;

public class BenzVan extends AbsBenz {

    private final static String R_SERIES = "R系列商务车";

    public String getModel() {
        return R_SERIES;
    }
}
