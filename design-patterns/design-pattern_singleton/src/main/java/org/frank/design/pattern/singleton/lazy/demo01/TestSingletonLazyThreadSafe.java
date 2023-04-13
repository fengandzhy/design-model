package org.frank.design.pattern.singleton.lazy.demo01;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

public class TestSingletonLazyThreadSafe {

    private static final Logger logger = LoggerFactory.getLogger(TestSingletonLazyThreadSafe.class);
    
    public static void main(String[] args) throws InterruptedException {
        testMultiThread();
    }
    
    public static void testMultiThread() throws InterruptedException {
        HashSet<Integer> hashCodeSet = new HashSet<>();
        final CountDownLatch countDownLatch = new CountDownLatch(100);
        ThreadForLazyThreadSafe[] threadForLazyThreadSafeArray = new ThreadForLazyThreadSafe[100];
        for(int i =0; i < 100; i++){
            threadForLazyThreadSafeArray[i] = new ThreadForLazyThreadSafe(hashCodeSet,countDownLatch);
        }
        for(int i =0; i < 100; i++){
            threadForLazyThreadSafeArray[i].start();
        }
        countDownLatch.await();
        for (Integer x : hashCodeSet) {
            logger.info(String.valueOf(x));
        }
    }
}
