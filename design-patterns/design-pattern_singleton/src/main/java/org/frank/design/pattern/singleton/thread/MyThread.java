package org.frank.design.pattern.singleton.thread;

import org.frank.design.pattern.singleton.hungry.SingletonHungry;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println(SingletonHungry.getInstance().hashCode());
    }
}
