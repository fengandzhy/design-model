package org.zhouhy.design.model.abstractfactory.md02;


import org.zhouhy.design.model.abstractfactory.md02.factory.CarFactory;
import org.zhouhy.design.model.abstractfactory.md02.factory.impl.BenzFactory;
import org.zhouhy.design.model.abstractfactory.md02.product.ICar;

public class Client {

    public static void main(String[] args) {

        System.out.println("===要求生产一辆奔驰SUV===");
        //首先找到生产奔驰车的工厂
        System.out.println("A、找到奔驰车工厂");
        CarFactory carFactory= new BenzFactory();
        //开始生产奔驰SUV
        System.out.println("B、开始生产奔驰SUV");
        ICar benzSuv = carFactory.createSuv();
        //生产完毕，展示一下车辆信息
        System.out.println("C、生产出的汽车如下：");
        System.out.println("汽车品牌："+benzSuv.getBand());
        System.out.println("汽车型号：" + benzSuv.getModel());
    }
}
