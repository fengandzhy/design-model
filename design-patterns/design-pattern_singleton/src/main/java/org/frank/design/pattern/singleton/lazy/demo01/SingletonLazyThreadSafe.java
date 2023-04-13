package org.frank.design.pattern.singleton.lazy.demo01;

public class SingletonLazyThreadSafe {
    
    private static volatile SingletonLazyThreadSafe singletonLazyThreadSafe;
    
    private SingletonLazyThreadSafe(){
        
    }
    
    public static SingletonLazyThreadSafe getInstance() {
        if(singletonLazyThreadSafe == null){
            synchronized (SingletonLazyThreadSafe.class){
                if(singletonLazyThreadSafe == null){
                    singletonLazyThreadSafe = new SingletonLazyThreadSafe();
                }                
            }
        }
        return singletonLazyThreadSafe;
    }
}
