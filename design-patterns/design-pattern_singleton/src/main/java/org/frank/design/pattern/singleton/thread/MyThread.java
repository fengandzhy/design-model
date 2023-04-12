package org.frank.design.pattern.singleton.thread;

import org.frank.design.pattern.singleton.enums.SingletonClassEnum;
import org.frank.design.pattern.singleton.hungry.SingletonHungry;
import org.frank.design.pattern.singleton.lazy.demo01.SingletonLazy;
import org.frank.design.pattern.singleton.lazy.demo02.SingletonLazyThreadUnsafe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyThread extends Thread{

    private static final Logger logger = LoggerFactory.getLogger(MyThread.class);
    private SingletonClassEnum singletonClassEnum;
    
    public MyThread(SingletonClassEnum singletonClassEnum){
        this.singletonClassEnum = singletonClassEnum;
    }
    
    @Override
    public void run() {
        switch (singletonClassEnum){
            case SINGLETON_LAZY:
                logger.info("SingletonLazy:"+SingletonLazy.getInstance().hashCode());
                break;                
            case SINGLETON_HUNGRY:
                logger.info("SingletonHungry:"+SingletonHungry.getInstance().hashCode());
                break;
            case SINGLETON_LAZY_UNSAFE:
                logger.info("SingletonLazyThreadUnsafe:"+SingletonLazyThreadUnsafe.getInstance().hashCode());
                break;
            default:
                throw new RuntimeException("No such class");
        }
        
    }
}
