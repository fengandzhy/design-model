package org.frank.design.pattern.mediator.demo01.colleague;

import org.frank.design.pattern.mediator.demo01.mediator.Mediator;

public class Boeing737 extends Aircraft{
    public Boeing737(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " received message: " + message);
    }
}
