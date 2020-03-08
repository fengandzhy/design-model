package org.zhouhy.design.model.sigleton.md01;

public class MySingleton {
	private static MySingleton mySingleton = new MySingleton();
	private MySingleton() {
		
	}
	
	public static MySingleton getInstance() {
		return mySingleton;
	}
}
