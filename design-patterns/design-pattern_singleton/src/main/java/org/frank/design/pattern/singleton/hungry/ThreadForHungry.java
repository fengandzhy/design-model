package org.frank.design.pattern.singleton.hungry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadForHungry extends Thread{

    private static final Logger logger = LoggerFactory.getLogger(ThreadForHungry.class);
    
    
    public ThreadForHungry(){        
    }
    
    @Override
    public void run() {
        logger.info("SingletonHungry:"+ SingletonHungry.getInstance().hashCode());        
    }
}
