package org.frank.design.pattern.singleton.lazy.demo02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;

public class TestSingletonLazyThreadUnsafe {
    
    private static final Logger logger = LoggerFactory.getLogger(TestSingletonLazyThreadUnsafe.class);
    
    public static void main(String[] args) throws InterruptedException {
        HashSet<Integer> hashCodeSet = new HashSet<>();
        ThreadForLazyThreadUnsafe[] threadForLazyThreadUnsafeArray = new ThreadForLazyThreadUnsafe[100];
        for(int i =0; i < 100; i++){
            threadForLazyThreadUnsafeArray[i] = new ThreadForLazyThreadUnsafe(hashCodeSet);
        }
        for(int i =0; i < 100; i++){
            threadForLazyThreadUnsafeArray[i].start();
        }
        for(int i =0; i < 100; i++){
            threadForLazyThreadUnsafeArray[i].join(); // 把threadForLazyThreadUnsafeArray[i]加入当前线程 
        }
        hashCodeSet.stream().forEach((x) -> {
           logger.info(String.valueOf(x)); 
        });
    }
}
