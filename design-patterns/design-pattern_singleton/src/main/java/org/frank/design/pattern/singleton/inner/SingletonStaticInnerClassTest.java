package org.frank.design.pattern.singleton.inner;


public class SingletonStaticInnerClassTest {
    public static void main(String[] args) {
        ThreadForInnerClass[] threads = new ThreadForInnerClass[100];
        for(int i =0; i < 100; i++) {
            threads[i] = new ThreadForInnerClass();
        }
        for(int i =0; i < 100; i++){
            threads[i].start();
        }
    }    
}
