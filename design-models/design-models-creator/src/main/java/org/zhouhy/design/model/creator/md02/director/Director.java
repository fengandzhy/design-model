package org.zhouhy.design.model.creator.md02.director;

import org.zhouhy.design.model.creator.md02.builder.Builder;
import org.zhouhy.design.model.creator.md02.builder.impl.GoodByeBuilder;
import org.zhouhy.design.model.creator.md02.builder.impl.WelcomBuilder;

public class Director {

    public void sendWelcome(String to,String from){
        Builder builder = new WelcomBuilder();
        builder.buildTo(to);
        builder.buildFrom(from);
        builder.buildSubject();
        builder.buildBody();
        builder.buildSendDate();
        builder.sendMessage();
    }

    public void sendGoodBye(String to,String from){
        Builder builder = new GoodByeBuilder();
        builder.buildTo(to);
        builder.buildFrom(from);
        builder.buildSubject();
        builder.buildBody();
        builder.buildSendDate();
        builder.sendMessage();
    }
}
