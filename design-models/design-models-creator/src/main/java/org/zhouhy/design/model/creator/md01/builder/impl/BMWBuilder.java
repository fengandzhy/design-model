package org.zhouhy.design.model.creator.md01.builder.impl;

import org.zhouhy.design.model.creator.md01.builder.CarBuilder;

public class BMWBuilder extends CarBuilder {

    @Override
    protected String buildWheel() {
        return super.getBlueprint().getWheel();
    }

    @Override
    protected String buildEngine() {
        return super.getBlueprint().getEngine();
    }
}
