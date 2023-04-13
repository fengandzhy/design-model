package org.frank.design.pattern.singleton.lazy.demo01;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;

public class TestSingletonLazyThreadSafe {

    private static final Logger logger = LoggerFactory.getLogger(TestSingletonLazyThreadSafe.class);
    
    public static void main(String[] args) throws InterruptedException {
        testMultiThread();
    }
    
    public static void testMultiThread() throws InterruptedException {
        HashSet<Integer> hashCodeSet = new HashSet<>();
        ThreadForLazyThreadSafe[] threadForLazyThreadSafeArray = new ThreadForLazyThreadSafe[100];
        for(int i =0; i < 100; i++){
            threadForLazyThreadSafeArray[i] = new ThreadForLazyThreadSafe(hashCodeSet);
        }
        for(int i =0; i < 100; i++){
            threadForLazyThreadSafeArray[i].start();
        }
        for(int i =0; i < 100; i++){
            threadForLazyThreadSafeArray[i].join(); // 把threadForLazyThreadUnsafeArray[i]加入当前线程 
        }
        for (Integer x : hashCodeSet) {
            logger.info(String.valueOf(x));
        }
    }
}
