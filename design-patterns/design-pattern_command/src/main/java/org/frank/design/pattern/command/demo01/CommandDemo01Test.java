package org.frank.design.pattern.command.demo01;

import org.frank.design.pattern.command.demo01.command.Command;
import org.frank.design.pattern.command.demo01.command.LightOnCommand;
import org.frank.design.pattern.command.demo01.invoker.RemoteControl;
import org.frank.design.pattern.command.demo01.receiver.Light;

public class CommandDemo01Test {
    public static void main(String[] args) {
        Light light = new Light();
        Command on = new LightOnCommand(light);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(on);
        remoteControl.buttonWasPressed();
    }
}
