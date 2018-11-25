package com.test.lazyInitializedSingleton;

public class LazyInitializedSingleton {

	private static LazyInitializedSingleton instance=null;

	private LazyInitializedSingleton() {
		System.out.println("Creating Lazy Initialized Singleton...");
	}

//	public static LazyInitializedSingleton getInstance() {
//		if (instance == null) {
//			instance = new LazyInitializedSingleton();
//		}
//		return instance;
//	}
	
//	public static synchronized LazyInitializedSingleton getInstance() {
//		if (instance == null) {
//			instance = new LazyInitializedSingleton();
//		}
//		return instance;
//	}
	
	public static LazyInitializedSingleton getInstance() {
		if (instance == null) {
			synchronized (LazyInitializedSingleton.class) {
				if (instance == null) {
					instance = new LazyInitializedSingleton();
				}
			}

		}
		return instance;
	}
}

/*
 * In the getInstance() method, we check if the static variable instance is null, then instantiate the object and return it. 
 * So, on the first call when instance would be null the object gets created and on the next successive calls it will return the same object.
 * 
 */

/*
 * But this code will fail in a multi-threaded environment. Imagine two threads concurrently accessing the class, thread t1 gives 
 * the first call to the getInstance() method, it checks if the static variable instance is null and then gets interrupted due to some reason. 
 * Another thread t2 calls the getInstance() method successfully passes the if check and instantiates the object.
 * Then, thread t1 gets awake and it also creates the object. At this time, there would be two objects of this class.
 */

/*
 * To avoid this, we will use the synchronized keyword to the getInstance() method. 
 * With this way, we force every thread to wait its turn before it can enter the method. 
 * So, no two threads will enter the method at the same time.The synchronized comes with a price, it will decrease the performance.
 */

/*
 * But if you want to use synchronization, there is another technique known as “double-checked locking” to reduce the use of synchronization.
 * With the double-checked locking, we first check to see if an instance is created, and
 * if not, then we synchronize. This way, we only synchronize the first time.
 */