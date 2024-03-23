package org.frank.design.pattern.command.demo01.command;

import org.frank.design.pattern.command.demo01.receiver.Light;

public class LightOnCommand implements Command{

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
