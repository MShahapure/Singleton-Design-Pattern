package com.test.cloneSingleton;

public class CloneSingleton implements Cloneable {

	private static final CloneSingleton instance = new CloneSingleton();

	private CloneSingleton() {
		System.out.println("Creating...");
	}

	public static CloneSingleton getInstance() {
		return instance;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
		System.out.println("\n");
		throw new CloneNotSupportedException("Singleton, cannot be clonned");
	}
}
