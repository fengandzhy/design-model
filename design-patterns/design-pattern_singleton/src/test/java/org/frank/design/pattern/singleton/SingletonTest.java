package org.frank.design.pattern.singleton;

import org.frank.design.pattern.singleton.enums.SingletonClassEnum;
import org.frank.design.pattern.singleton.thread.MyThread;
import org.junit.Test;


public class SingletonTest {

    @Test
    public void testSingletonHungry(){
        for(int i =0; i < 100; i++){
            MyThread myThread = new MyThread(SingletonClassEnum.SINGLETON_HUNGRY);
            myThread.run();
        }
    }
}
