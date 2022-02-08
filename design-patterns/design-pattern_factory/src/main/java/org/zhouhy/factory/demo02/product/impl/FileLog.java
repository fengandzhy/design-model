package org.zhouhy.factory.demo02.product.impl;


import org.zhouhy.factory.demo02.product.Log;

public class FileLog implements Log {
    
    @Override
    public void writeLog(String destination) {
        System.out.println("FileLog write log to "+destination);
    }
}
