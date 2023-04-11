package org.frank.design.pattern.singleton.lazy.demo02;

public class SingletonLazyThreadUnsafe {
    
    private static SingletonLazyThreadUnsafe singletonLazyThreadUnsafe;
    
    private SingletonLazyThreadUnsafe(){
        
    }
    
    public static SingletonLazyThreadUnsafe getInstance(){
        if(singletonLazyThreadUnsafe == null){
            singletonLazyThreadUnsafe = new SingletonLazyThreadUnsafe();
        }
        return singletonLazyThreadUnsafe;
    }    
}
