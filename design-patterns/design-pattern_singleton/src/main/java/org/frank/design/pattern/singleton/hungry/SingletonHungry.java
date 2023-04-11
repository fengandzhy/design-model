package org.frank.design.pattern.singleton.hungry;

public class SingletonHungry {
    private static volatile SingletonHungry singletonHungry = new SingletonHungry();
    
    private SingletonHungry(){
        
    }
    
    public static SingletonHungry getInstance(){        
        return singletonHungry;
    }
}
