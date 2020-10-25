package org.zhouhy.design.model.sigleton.md07;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class MySingleton implements Serializable {

    private MySingleton mySingleton;

    private MySingleton(){

    }

    private enum MyEnum{
        myEnum;
        private MySingleton instance;

        MyEnum(){
            instance = new MySingleton();
        }

        private MySingleton getInstance(){
            return instance;
        }

    }

    public static MySingleton getInstance(){
        return MyEnum.myEnum.getInstance();
    }

    //该方法在反序列化时会被调用，该方法不是接口定义的方法，有点儿约定俗成的感觉
    protected Object readResolve() throws ObjectStreamException {
        System.out.println("调用了readResolve方法！");
        return MyEnum.myEnum.getInstance();
    }

}
