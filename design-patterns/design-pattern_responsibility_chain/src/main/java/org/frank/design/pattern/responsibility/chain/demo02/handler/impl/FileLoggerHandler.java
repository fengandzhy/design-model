package org.frank.design.pattern.responsibility.chain.demo02.handler.impl;

import org.frank.design.pattern.responsibility.chain.demo02.handler.LoggerHandler;

public class FileLoggerHandler extends LoggerHandler {
    
    public FileLoggerHandler(int level){
        this.level = level;
    }
    
    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
