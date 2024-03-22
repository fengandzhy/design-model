package org.frank.design.pattern.abatract.factor.demo01.factory.impl;

import org.frank.design.pattern.abatract.factor.demo01.factory.GuiFactory;
import org.frank.design.pattern.abatract.factor.demo01.product.Button;
import org.frank.design.pattern.abatract.factor.demo01.product.CheckBox;
import org.frank.design.pattern.abatract.factor.demo01.product.impl.WindowsButton;
import org.frank.design.pattern.abatract.factor.demo01.product.impl.WindowsCheckBox;

public class WindowsGuiFactory implements GuiFactory {
    
    private static final String WINDOWS = "Windows";
    
    @Override
    public Button createButton() {
        WindowsButton button = new WindowsButton(WINDOWS);
        return button;
    }

    @Override
    public CheckBox createCheckbox() {
        CheckBox checkBox = new WindowsCheckBox(WINDOWS);
        return checkBox;
    }
}
