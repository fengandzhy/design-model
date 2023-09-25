package org.frank.design.pattern.decrorator.demo01;

public class DecoratorPatternDemo01 {
    public static void main(String[] args) {
        // 创建浓缩咖啡
        Coffee espresso = new Espresso();
        System.out.println("订单：" + espresso.description() + "，价格：" + espresso.cost());

        // 添加牛奶和糖
        Coffee latteWithMilkAndSugar = new SugarDecorator(new MilkDecorator(new Latte()));
        System.out.println("订单：" + latteWithMilkAndSugar.description() + "，价格：" + latteWithMilkAndSugar.cost());
    }
}
