package org.frank.design.pattern.abatract.factor.demo01.client;

import org.frank.design.pattern.abatract.factor.demo01.factory.GuiFactory;
import org.frank.design.pattern.abatract.factor.demo01.product.Button;
import org.frank.design.pattern.abatract.factor.demo01.product.CheckBox;

public class Application {
    private Button button;
    private CheckBox checkBox;
    
    public Application(GuiFactory guiFactory){
        this.button = guiFactory.createButton();
        this.checkBox = guiFactory.createCheckbox();
    }
    
    public void operate(String operator){
        this.button.click(operator);
        this.checkBox.check(operator);
    }
}
