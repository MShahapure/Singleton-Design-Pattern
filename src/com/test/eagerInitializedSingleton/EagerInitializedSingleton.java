package com.test.eagerInitializedSingleton;

public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	// By keeping the constructor private, no other class can instantiate this
	// class.
	private EagerInitializedSingleton() {
		System.out.println("Creating Eager Initialized Singleton...");
	}

	// this is the global access point for outer world to get the instance of the
	// singleton class.Also this method doesn’t provide any options for exception handling.
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
}

/*
 * So, this is our singleton class which makes sure that only one object of the
 * class gets created and even if there are several requests, only the same
 * instantiated object will be returned.
 * 
 * The one problem with this approach is that, the object would get created as soon as the class gets loaded into the JVM.
 * If the object is never requested, there would be an object useless inside the memory. 
 * 
 * It’s always a good approach that an object should get created when it is required. 
 * 
 * So, we will create an object on the first call and then will return the same object on other successive calls.
 */