package org.frank.design.pattern.abatract.factor.demo01.factory.impl;

import org.frank.design.pattern.abatract.factor.demo01.factory.GuiFactory;
import org.frank.design.pattern.abatract.factor.demo01.product.Button;
import org.frank.design.pattern.abatract.factor.demo01.product.CheckBox;
import org.frank.design.pattern.abatract.factor.demo01.product.impl.MacButton;
import org.frank.design.pattern.abatract.factor.demo01.product.impl.MacCheckBox;

public class MacGuiFactory implements GuiFactory {
    
    private static final String MAC = "Mac";
    
    @Override
    public Button createButton() {
        return new MacButton(MAC);
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacCheckBox(MAC);
    }
}
