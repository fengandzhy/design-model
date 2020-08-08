package org.zhouhy.design.model.creator.md02.builder.impl;

import org.zhouhy.design.model.creator.md02.builder.Builder;
import org.zhouhy.design.model.creator.md02.product.WelcomeMessage;

public class WelcomBuilder extends Builder {

    public WelcomBuilder(){
        this.autoMessage = new WelcomeMessage();
    }

    @Override
    public void buildSubject() {
        autoMessage.setSubject("欢迎标题");
    }

    @Override
    public void buildBody() {
        autoMessage.setBody("欢迎内容");
    }
}
