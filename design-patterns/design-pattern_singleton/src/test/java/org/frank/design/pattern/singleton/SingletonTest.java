//package org.frank.design.pattern.singleton;
//
//
//import org.frank.design.pattern.singleton.hungry.TestThreadForHungry;
//import org.frank.design.pattern.singleton.lazy.demo02.TestThreadForLazyThreadUnsafe;
//import org.junit.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.util.HashSet;
//
//
//public class SingletonTest {
//
//    private static final Logger logger = LoggerFactory.getLogger(SingletonTest.class);
//    @Test
//    public void testSingletonHungry(){
//        for(int i =0; i < 100; i++){
//            TestThreadForHungry myThread = new TestThreadForHungry();
//            myThread.start();
//        }
//    }
//
//    @Test
//    public void testSingletonLazyThreadUnsafe(){
//        HashSet<Integer> hashSet = new HashSet<>();
//        for(int i =0; i < 100; i++){
//            TestThreadForLazyThreadUnsafe testThreadForLazyThreadUnsafe = new TestThreadForLazyThreadUnsafe(hashSet);
//            testThreadForLazyThreadUnsafe.start();
//        }
//        
//    }
//}
