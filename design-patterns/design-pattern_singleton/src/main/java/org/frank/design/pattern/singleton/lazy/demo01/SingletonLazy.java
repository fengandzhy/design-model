package org.frank.design.pattern.singleton.lazy.demo01;

public class SingletonLazy {
    
    private static volatile SingletonLazy singletonLazy;
    
    private SingletonLazy(){
        
    }
    
    public static SingletonLazy getInstance() {
        if(singletonLazy == null){
            synchronized (SingletonLazy.class){
                if(singletonLazy == null){
                    singletonLazy = new SingletonLazy();
                }                
            }
        }
        return singletonLazy;
    }
}
