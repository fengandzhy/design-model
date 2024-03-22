package org.frank.design.pattern.abatract.factor.demo01.factory;

import org.frank.design.pattern.abatract.factor.demo01.product.Button;
import org.frank.design.pattern.abatract.factor.demo01.product.CheckBox;


public interface GuiFactory {
    Button createButton();
    CheckBox createCheckbox();
}
