package org.frank.design.pattern.singleton.lazy.demo02;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;

public class ThreadForLazyThreadUnsafe extends Thread{

    private static final Logger logger = LoggerFactory.getLogger(ThreadForLazyThreadUnsafe.class);
    private final HashSet<Integer> hashCodeSet;

    public ThreadForLazyThreadUnsafe(HashSet<Integer> hashCodeSet){
        this.hashCodeSet = hashCodeSet;
    }

    @Override
    public void run() {
        Integer hashCode = SingletonLazyThreadUnsafe.getInstance().hashCode();
        hashCodeSet.add(hashCode);
        logger.info(String.valueOf(hashCode));
    }
}
