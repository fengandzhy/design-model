package org.frank.design.pattern.singleton.lazy.demo02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;

public class ThreadForLazyThreadUnsafe extends Thread{

    private static final Logger logger = LoggerFactory.getLogger(ThreadForLazyThreadUnsafe.class);
    private HashSet<Integer> hashCodeSet;


    public ThreadForLazyThreadUnsafe(HashSet<Integer> hashCodeSet){
        this.hashCodeSet = hashCodeSet;
    }

    @Override
    public void run() {
        hashCodeSet.add(SingletonLazyThreadUnsafe.getInstance().hashCode()); 
        hashCodeSet.stream().forEach((x)->{
            logger.info(String.valueOf(x));
        });
    }
}
