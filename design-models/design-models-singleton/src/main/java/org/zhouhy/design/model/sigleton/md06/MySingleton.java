package org.zhouhy.design.model.sigleton.md06;

public class MySingleton {
    private MySingleton(){}
    private enum MyEnumSingleton{
        singletonFactory;

        private MySingleton instance;

        MyEnumSingleton(){//枚举类的构造方法在类加载是被实例化
            instance = new MySingleton();
        }

        public MySingleton getInstance(){
            return instance;
        }
    }
    public static MySingleton getInstance(){
        return MySingleton.MyEnumSingleton.singletonFactory.getInstance();
    }
}
