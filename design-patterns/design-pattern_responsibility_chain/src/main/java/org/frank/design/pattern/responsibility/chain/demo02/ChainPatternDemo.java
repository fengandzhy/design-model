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
        
        consoleLogger.setNextLoggerHandler(fileLogger);
        fileLogger.setNextLoggerHandler(errorLogger);
        return consoleLogger;
    }
    
    public static void main(String[] args) {
        LoggerHandler loggerChain = getChainLoggers();

        loggerChain.logMessage(LoggerHandler.INFO, "This is an information.");
        loggerChain.logMessage(LoggerHandler.DEBUG, "This is a debug level information.");
        loggerChain.logMessage(LoggerHandler.ERROR, "This is an error information.");
    }
}
