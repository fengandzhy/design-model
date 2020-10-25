package org.zhouhy.design.model.sigleton.md02;

/**
 * 懒汉式单例模式
 * */
public class LazySingleton {
	
	private static LazySingleton lazySingleton;
	
	private LazySingleton() {
		
	}
	
	public static LazySingleton getInstance(){
		if(lazySingleton==null) {
			try {
				Thread.sleep(300);
				lazySingleton = new LazySingleton();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
		return lazySingleton;
	}
}
