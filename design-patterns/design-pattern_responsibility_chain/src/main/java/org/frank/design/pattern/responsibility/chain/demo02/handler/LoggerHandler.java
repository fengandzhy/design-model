package org.frank.design.pattern.responsibility.chain.demo02.handler;

public abstract class LoggerHandler {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    
    protected int level;
    
    protected LoggerHandler nextLoggerHandler;
    
    public void logMessage(int level, String message){
        if(this.level >= level){
            write(message);
        }else{
            nextLoggerHandler.logMessage(level, message);
        }
    }

    public void setNextLoggerHandler(LoggerHandler nextLoggerHandler) {
        this.nextLoggerHandler = nextLoggerHandler;
    }

    abstract protected void write(String message);
}
