package org.zhouhy.design.model.creator.md01.director;

import org.zhouhy.design.model.creator.md01.builder.CarBuilder;
import org.zhouhy.design.model.creator.md01.builder.impl.BMWBuilder;
import org.zhouhy.design.model.creator.md01.builder.impl.BenzBuilder;
import org.zhouhy.design.model.creator.md01.product.ICar;

public class Director {

    private CarBuilder benzBuilder = new BenzBuilder();
    private CarBuilder bmwBuilder = new BMWBuilder();

    public ICar createBenzSuv(){
        //制造出汽车
        return createCar(benzBuilder, "benz的引擎", "benz的轮胎");
    }
    //生产出一辆宝马商务车
    public ICar createBMWVan(){
        return createCar(benzBuilder, "BMW的引擎", "BMW的轮胎");
    }
    //生产出一个混合车型
    public ICar createComplexCar(){
        return createCar(bmwBuilder, "BMW的引擎", "benz的轮胎");
    }
    //生产车辆
    private ICar createCar(CarBuilder _carBuilder,String engine,String wheel){

        Blueprint bp = new Blueprint();
        bp.setEngine(engine);
        bp.setWheel(wheel);
        System.out.println("获得生产蓝图");
        _carBuilder.receiveBlueprint(bp);
        return _carBuilder.buildCar();
    }
}
