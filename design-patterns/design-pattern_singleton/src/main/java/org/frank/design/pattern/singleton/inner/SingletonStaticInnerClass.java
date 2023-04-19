package org.frank.design.pattern.singleton.inner;

public class SingletonStaticInnerClass {
    
    private static class SingletonHolder {
        private static final SingletonStaticInnerClass INSTANCE = new SingletonStaticInnerClass();
    }
    
    private SingletonStaticInnerClass(){
        
    }
    
    public static SingletonStaticInnerClass getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
