package org.frank.design.pattern.responsibility.chain.demo02.handler.impl;

import org.frank.design.pattern.responsibility.chain.demo02.handler.LoggerHandler;

public class ErrorLoggerHandler extends LoggerHandler {
    
    public ErrorLoggerHandler(int level){
        this.level = level;
    }
    
    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
