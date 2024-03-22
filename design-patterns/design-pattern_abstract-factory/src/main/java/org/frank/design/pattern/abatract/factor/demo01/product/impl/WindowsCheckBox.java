package org.frank.design.pattern.abatract.factor.demo01.product.impl;

import org.frank.design.pattern.abatract.factor.demo01.product.CheckBox;

public class WindowsCheckBox implements CheckBox {

    private String operationalSystem;

    public WindowsCheckBox(String operationalSystem){
        this.operationalSystem = operationalSystem;
    }
    
    @Override
    public void check(String operator) {
        System.out.println(operator + " check the check box in "+operationalSystem);
    }
}
