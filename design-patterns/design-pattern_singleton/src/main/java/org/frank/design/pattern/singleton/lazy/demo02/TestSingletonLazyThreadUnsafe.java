package org.frank.design.pattern.singleton.lazy.demo02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;

public class TestSingletonLazyThreadUnsafe {
    
    private static final Logger logger = LoggerFactory.getLogger(TestSingletonLazyThreadUnsafe.class);
    
    @SuppressWarnings("DuplicatedCode")
    public static void main(String[] args) throws InterruptedException {
        HashSet<Integer> hashCodeSet = new HashSet<>();
        ThreadForLazyThreadUnsafe[] threadForLazyThreadUnsafeArray = new ThreadForLazyThreadUnsafe[100];
        for(int i =0; i < 100; i++) threadForLazyThreadUnsafeArray[i] = new ThreadForLazyThreadUnsafe(hashCodeSet);
        for(int i =0; i < 100; i++){
            threadForLazyThreadUnsafeArray[i].start();
            threadForLazyThreadUnsafeArray[i].join(); 
        }        
        for (Integer x : hashCodeSet) {
            logger.info(String.valueOf(x));
        }
    }
}
