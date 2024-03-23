package org.frank.design.pattern.command.demo01.invoker;

import org.frank.design.pattern.command.demo01.command.Command;

public class RemoteControl {
    private Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
