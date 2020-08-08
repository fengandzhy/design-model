package org.zhouhy.design.model.creator.md02.builder;

import org.zhouhy.design.model.creator.md02.product.AutoMessage;

import java.util.Date;

public abstract class Builder {

    protected AutoMessage autoMessage;

    public abstract void buildSubject();

    public abstract void buildBody();

    public void buildTo(String to){
        autoMessage.setTo(to);
    }

    public void buildFrom(String from){
        autoMessage.setFrom(from);
    }

    public void buildSendDate(){
        autoMessage.setSendDate(new Date());
    }

    public void sendMessage(){
        autoMessage.send();
    }



}
