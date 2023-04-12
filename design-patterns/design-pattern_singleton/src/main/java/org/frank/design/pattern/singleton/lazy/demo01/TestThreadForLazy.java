package org.frank.design.pattern.singleton.lazy.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestThreadForLazy extends Thread{

    private static final Logger logger = LoggerFactory.getLogger(TestThreadForLazy.class);
    
    
    public TestThreadForLazy(){
        
    }
    
    @Override
    public void run() {
        logger.info("SingletonLazy:"+SingletonLazy.getInstance().hashCode());        
    }
}
