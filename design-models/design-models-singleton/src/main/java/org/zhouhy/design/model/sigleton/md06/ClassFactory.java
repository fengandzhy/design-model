package org.zhouhy.design.model.sigleton.md06;

import sun.awt.geom.AreaOp;

public class ClassFactory {
    private enum MyEnumSingleton{
        singletonFactory;

        private MySingleton instance;

        private MyEnumSingleton(){//枚举类的构造方法在类加载是被实例化
            instance = new MySingleton();
        }

        public MySingleton getInstance(){
            return instance;
        }
    }

    public static MySingleton getInstance(){
        return MyEnumSingleton.singletonFactory.getInstance();
    }

    public static MyEnumSingleton getr(){
        return MyEnumSingleton.singletonFactory;
    }

}
