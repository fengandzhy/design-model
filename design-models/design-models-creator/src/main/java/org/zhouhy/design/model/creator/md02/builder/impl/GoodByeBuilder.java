package org.zhouhy.design.model.creator.md02.builder.impl;

import org.zhouhy.design.model.creator.md02.builder.Builder;
import org.zhouhy.design.model.creator.md02.product.GoodbyeMessage;

public class GoodByeBuilder extends Builder {

    public GoodByeBuilder(){
        this.autoMessage = new GoodbyeMessage();
    }

    @Override
    public void buildSubject() {
        autoMessage.setSubject("欢送标题");
    }

    @Override
    public void buildBody() {
        autoMessage.setBody("欢送内容");
    }
}
