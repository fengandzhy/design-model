package org.frank.design.pattern.singleton.lazy.demo01;

import org.frank.design.pattern.singleton.lazy.demo02.SingletonLazyThreadUnsafe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;

public class ThreadForLazyThreadSafe extends Thread{
    
    private static final Logger logger = LoggerFactory.getLogger(ThreadForLazyThreadSafe.class);
    private HashSet<Integer> hashCodeSet;
    
    public ThreadForLazyThreadSafe(HashSet<Integer> hashCodeSet){
        this.hashCodeSet = hashCodeSet;
    }
    
    @Override
    public void run() {
        Integer hashCode = SingletonLazyThreadSafe.getInstance().hashCode();
        hashCodeSet.add(hashCode);
        logger.info(String.valueOf(hashCode));
    }
}
