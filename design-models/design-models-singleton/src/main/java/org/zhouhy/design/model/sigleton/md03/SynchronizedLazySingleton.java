package org.zhouhy.design.model.sigleton.md03;

public class SynchronizedLazySingleton {
	
	private static SynchronizedLazySingleton synchronizedLazySingleton;
	
	private SynchronizedLazySingleton() {
		
	}
	
	public static SynchronizedLazySingleton getInstance() {
		try {
			if (synchronizedLazySingleton != null) {

			} else {
				Thread.sleep(300);
				synchronized (SynchronizedLazySingleton.class) {
					if(synchronizedLazySingleton==null) {
						synchronizedLazySingleton = new SynchronizedLazySingleton();
					}					
				}
			} 
		} catch (Exception e) {
			// TODO: handle exception
		}
		return synchronizedLazySingleton;
	}
}
