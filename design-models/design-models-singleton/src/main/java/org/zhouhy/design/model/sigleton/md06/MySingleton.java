package org.zhouhy.design.model.sigleton.md06;

public class MySingleton {
    private MySingleton(){}
    private enum MyEnumSingleton{
        singletonFactory;

        private MySingleton instance;

        //只要调用了MyEnumSingleton.singletonFactory 就会立马执行这个构造器
        MyEnumSingleton(){//枚举类的构造方法在类加载是被实例化
            System.out.println("It is here");
            instance = new MySingleton();
        }

        public MySingleton getInstance(){
            return instance;
        }
    }
    public static MySingleton getInstance(){
        return MyEnumSingleton.singletonFactory.getInstance();
    }
}
