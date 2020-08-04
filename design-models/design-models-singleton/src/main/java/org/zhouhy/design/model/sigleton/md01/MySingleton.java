package org.zhouhy.design.model.sigleton.md01;


/**
 * 饿汉式单例模式
 * */
public class MySingleton {
	private static MySingleton mySingleton = new MySingleton();
	private MySingleton() {
		
	}
	
	public static MySingleton getInstance() {
		return mySingleton;
	}
}
