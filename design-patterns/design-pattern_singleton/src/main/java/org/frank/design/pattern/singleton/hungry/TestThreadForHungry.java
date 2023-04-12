package org.frank.design.pattern.singleton.hungry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestThreadForHungry extends Thread{

    private static final Logger logger = LoggerFactory.getLogger(TestThreadForHungry.class);
    
    
    public TestThreadForHungry(){        
    }
    
    @Override
    public void run() {
        logger.info("SingletonHungry:"+ SingletonHungry.getInstance().hashCode());        
    }
}
