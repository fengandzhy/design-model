package org.zhouhy.factory.demo02.factory.impl;

import org.zhouhy.factory.demo02.factory.LogFactory;
import org.zhouhy.factory.demo02.product.Log;
import org.zhouhy.factory.demo02.product.impl.FileLog;


public class FileLogFactory implements LogFactory {
    
    /**
     * 具体的创建FileLog的逻辑
     * */
    @Override
    public Log createLog() {
        return new FileLog();
    }
}
