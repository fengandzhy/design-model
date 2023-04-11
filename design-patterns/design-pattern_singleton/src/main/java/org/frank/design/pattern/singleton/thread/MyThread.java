package org.frank.design.pattern.singleton.thread;

import org.frank.design.pattern.singleton.enums.SingletonClassEnum;
import org.frank.design.pattern.singleton.hungry.SingletonHungry;
import org.frank.design.pattern.singleton.lazy.demo01.SingletonLazy;
import org.frank.design.pattern.singleton.lazy.demo02.SingletonLazyThreadUnsafe;

public class MyThread extends Thread{

    private SingletonClassEnum singletonClassEnum;
    
    public MyThread(SingletonClassEnum singletonClassEnum){
        this.singletonClassEnum = singletonClassEnum;
    }
    
    @Override
    public void run() {
        switch (singletonClassEnum){
            case SINGLETON_LAZY:
                System.out.println(SingletonLazy.getInstance().hashCode());
                break;                
            case SINGLETON_HUNGRY:
                System.out.println(SingletonHungry.getInstance().hashCode());
                break;
            case SINGLETON_LAZY_UNSAFE:
                System.out.println(SingletonLazyThreadUnsafe.getInstance().hashCode());
                break;
            default:
                throw new RuntimeException("No such class");
        }
        
    }
}
