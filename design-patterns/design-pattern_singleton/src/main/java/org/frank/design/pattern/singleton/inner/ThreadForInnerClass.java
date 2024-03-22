package org.frank.design.pattern.singleton.inner;


public class ThreadForInnerClass extends Thread{    

    @Override
    public void run() {
        System.out.println("SingletonInnerClass:"+ SingletonStaticInnerClass.getInstance().hashCode());
    }
}
