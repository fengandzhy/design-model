package org.frank.design.pattern.strategy.demo01;

/**
 * 我明白您的疑问，策略模式的主要目的是将条件判断从客户端代码中分离出来，并将不同的策略封装到独立的类中。
 * 虽然在测试用例中仍然需要使用条件语句来选择不同的策略类，但在实际应用程序中，条件判断被移动到了设置策略的地方，而不是在计算折扣的地方。
 * 这就实现了将条件判断从核心业务逻辑中移除的目的。
 * 但在实际应用中，您可以通过配置文件、用户输入或其他方式来决定使用哪个策略类，而不需要硬编码在代码中。
 * 这使得您可以在运行时动态选择策略，而不必修改核心业务逻辑中的条件判断。
 * */
public class DiscountCalculator {
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateDiscount(double purchaseAmount) {
        return discountStrategy.calculateDiscount(purchaseAmount);
    }
}
