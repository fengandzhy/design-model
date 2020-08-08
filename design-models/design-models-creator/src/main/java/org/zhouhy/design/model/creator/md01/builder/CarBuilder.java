package org.zhouhy.design.model.creator.md01.builder;

import org.zhouhy.design.model.creator.md01.director.Blueprint;
import org.zhouhy.design.model.creator.md01.product.ICar;
import org.zhouhy.design.model.creator.md01.product.impl.Car;

public abstract class CarBuilder {

    private ICar car;

    private Blueprint bp;

    public void receiveBlueprint(Blueprint _bp){
        this.bp = _bp;
    }

    public Car buildCar(){
        return new Car(buildEngine(),buildWheel());
    }

    protected Blueprint getBlueprint(){
        return bp;
    }

    protected abstract String buildWheel();
    //建造引擎
    protected abstract String buildEngine();
}
