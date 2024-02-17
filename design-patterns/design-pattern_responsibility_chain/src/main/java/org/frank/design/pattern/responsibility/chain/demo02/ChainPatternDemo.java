package org.frank.design.pattern.responsibility.chain.demo02;

import org.frank.design.pattern.responsibility.chain.demo02.handler.LoggerHandler;
import org.frank.design.pattern.responsibility.chain.demo02.handler.impl.ConsoleLoggerHandler;
import org.frank.design.pattern.responsibility.chain.demo02.handler.impl.ErrorLoggerHandler;
import org.frank.design.pattern.responsibility.chain.demo02.handler.impl.FileLoggerHandler;

public class ChainPatternDemo {

    private static LoggerHandler getChainLoggers(){
        LoggerHandler errorLogger = new ErrorLoggerHandler(LoggerHandler.ERROR);
        LoggerHandler fileLogger = new FileLoggerHandler(LoggerHandler.DEBUG);
        LoggerHandler consoleLogger = new ConsoleLoggerHandler(LoggerHandler.INFO);
        
        
        return consoleLogger;
    }
    
    public static void main(String[] args) {
        
    }
}
