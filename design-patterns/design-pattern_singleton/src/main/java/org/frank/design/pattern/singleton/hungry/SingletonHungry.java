package org.frank.design.pattern.singleton.hungry;

public class SingletonHungry {
    private static volatile SingletonHungry singletonHungry;
    
    private SingletonHungry(){
        
    }
    
    public static SingletonHungry getInstance(){
        if(singletonHungry == null){
            synchronized (SingletonHungry.class){
                if(singletonHungry == null){
                    singletonHungry = new SingletonHungry();                    
                }
            }            
        }
        return singletonHungry;
    }
}
