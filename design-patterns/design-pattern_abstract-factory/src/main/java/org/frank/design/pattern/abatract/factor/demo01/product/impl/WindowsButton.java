package org.frank.design.pattern.abatract.factor.demo01.product.impl;

import org.frank.design.pattern.abatract.factor.demo01.product.Button;

public class WindowsButton implements Button {
    
    private String operationalSystem;
    
    public WindowsButton(String operationalSystem){
        this.operationalSystem = operationalSystem;
    }

    @Override
    public void click(String operator) {
        System.out.println(operator + " click the button in "+operationalSystem);
    }
}
