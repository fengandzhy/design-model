package org.zhouhy.design.model.sigleton.md08;

public class Singleton8 {
    private static Singleton8 singleton;
    private static boolean isCreated = false;
    private Singleton8(){
        synchronized (Singleton8.class){
            if(!isCreated){
                isCreated = true;
            }else{
                throw new RuntimeException("遭到反射攻击"); //这里用抛异常的方式确保单例无法调用成功
            }
        }
    }
    public static Singleton8 getInstance(){
        if(singleton == null){
            try {
                Thread.sleep(300);
                singleton = new Singleton8();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return singleton;
    }
}
