package org.frank.design.pattern.command.demo01;

import org.frank.design.pattern.command.demo01.command.Command;
import org.frank.design.pattern.command.demo01.command.LightOnCommand;
import org.frank.design.pattern.command.demo01.invoker.RemoteControl;
import org.frank.design.pattern.command.demo01.receiver.Light;

/**
 * 它将一个请求封装为一个对象，从而让你使用不同的请求、队列或日志请求来参数化其他对象。
 * 
 * */
public class CommandDemo01Test {
    public static void main(String[] args) {
        Light light = new Light();
        Command on = new LightOnCommand(light);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(on);
        remoteControl.buttonWasPressed();
    }
}
