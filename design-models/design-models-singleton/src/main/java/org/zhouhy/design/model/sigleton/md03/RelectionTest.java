package org.zhouhy.design.model.sigleton.md03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class RelectionTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        SynchronizedLazySingleton singleton = SynchronizedLazySingleton.getInstance();
        Constructor<? extends SynchronizedLazySingleton> constructor = singleton.getClass().getDeclaredConstructor();
        constructor.setAccessible(true);
        SynchronizedLazySingleton singleton1 = constructor.newInstance();
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}
