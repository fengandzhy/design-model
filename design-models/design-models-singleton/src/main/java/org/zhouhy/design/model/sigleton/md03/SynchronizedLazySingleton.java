package org.zhouhy.design.model.sigleton.md03;

/**
 * 线程安全的懒汉模式
 * Ⅰ、给 uniqueInstance分配内存
 *
 * Ⅱ、调用 Singleton 的构造函数来初始化成员变量
 *
 * Ⅲ、将uniqueInstance对象指向分配的内存空间（执行完这步uniqueInstance 就为非 null 了）， 但是在 JVM 的即时编译器中存在指令重排序的优化。也就是说上面的第二步和第三步的顺序是不能保证的，最终的执行顺序可能是 1-2-3 也可能是 1-3-2。如果是后者，则在 3 执行完毕、2 未执行之前，被线程二抢占了，这时 instance 已经是非 null 了（但却没有初始化），所以线程二会直接返回 instance，然后使用，然后顺理成章地报错。
 *
 * 例如，线程 T1 执行了 1 和 3，此时 T2 调用 getUniqueInstance() 后发现 uniqueInstance 不为空，因此返回 uniqueInstance，但此时 uniqueInstance 还未被 初始化。使用 volatile 可以禁止 JVM 的指令重排，保证在多线程环境下也能正常运行。
 * */
public class SynchronizedLazySingleton {
	
	//这里在声明变量时使用了volatile关键字来保证其线程间的可见性
	private volatile static SynchronizedLazySingleton synchronizedLazySingleton;
	
	private SynchronizedLazySingleton() {
		
	}
	
	public static SynchronizedLazySingleton getInstance() {
		try {
			if (synchronizedLazySingleton == null) {
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
