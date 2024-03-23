package org.frank.design.pattern.mediator.demo01.colleague;

import org.frank.design.pattern.mediator.demo01.mediator.Mediator;

public abstract class Aircraft {
    protected Mediator mediator;
    protected String name;

    public Aircraft(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void send(String message) {
        System.out.println(this.name + " sending message: " + message);
        mediator.sendMessage(message, this);
    }

    public abstract void receive(String message);
}
