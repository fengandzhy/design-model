package org.frank.design.pattern.responsibility.chain.demo02.handler.impl;

import org.frank.design.pattern.responsibility.chain.demo02.handler.LoggerHandler;

public class ConsoleLoggerHandler extends LoggerHandler {
    
    public ConsoleLoggerHandler(int level){
        this.level = level;
    }
    
    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
