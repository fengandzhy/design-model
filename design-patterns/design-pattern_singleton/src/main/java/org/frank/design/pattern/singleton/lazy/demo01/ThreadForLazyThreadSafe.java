package org.frank.design.pattern.singleton.lazy.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadForLazyThreadSafe extends Thread{

    private static final Logger logger = LoggerFactory.getLogger(ThreadForLazyThreadSafe.class);
    
    
    public ThreadForLazyThreadSafe(){
        
    }
    
    @Override
    public void run() {
        logger.info("SingletonLazy:"+ SingletonLazyThreadSafe.getInstance().hashCode());        
    }
}
