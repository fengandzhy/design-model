package org.frank.design.pattern.singleton;


import org.frank.design.pattern.singleton.hungry.TestThreadForHungry;
import org.junit.Test;


public class SingletonTest {

    @Test
    public void testSingletonHungry(){
        for(int i =0; i < 100; i++){
            TestThreadForHungry myThread = new TestThreadForHungry();
            myThread.run();
        }
    }
}
