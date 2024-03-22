package org.frank.design.pattern.responsibility.chain.demo01;

import org.frank.design.pattern.responsibility.chain.demo01.handler.DiscountHandler;
import org.frank.design.pattern.responsibility.chain.demo01.handler.impl.RegularDiscountHandler;
import org.frank.design.pattern.responsibility.chain.demo01.handler.impl.VIPDiscountHandler;

/**
 * 在这个示例中，我们创建了一个责任链，包括普通用户折扣处理器和VIP用户折扣处理器。然后，我们设置了责任链的顺序，按顺序处理订单折扣请求。
 *
 * 通过责任链模式，我们可以很容易地扩展责任链，添加新的处理器，而不需要修改现有的处理器或客户端代码。这种模式使得代码更加灵活、可维护，并降低了耦合度。
 * */
public class ResponsibilityChainDemo01Test {
    public static void main(String[] args) {
        DiscountHandler regularHandler = new RegularDiscountHandler();
        DiscountHandler vipHandler = new VIPDiscountHandler();

        // 设置责任链的顺序
        regularHandler.setSuccessor(vipHandler);

        // 处理订单折扣请求
        double purchaseAmount1 = 90.0;
        double discountedPrice1 = regularHandler.applyDiscount(purchaseAmount1);
        System.out.println("订单金额：" + purchaseAmount1 + "，折扣后价格：" + discountedPrice1);

        double purchaseAmount2 = 210.0;
        double discountedPrice2 = regularHandler.applyDiscount(purchaseAmount2);
        System.out.println("订单金额：" + purchaseAmount2 + "，折扣后价格：" + discountedPrice2);
    }
}
