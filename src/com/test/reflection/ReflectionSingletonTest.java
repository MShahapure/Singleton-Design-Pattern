package com.test.reflection;

public class ReflectionSingletonTest {

	private static ReflectionSingletonTest instance = new ReflectionSingletonTest();

	private ReflectionSingletonTest() {
		if (instance != null) {
			throw new RuntimeException("Cannot create, please use getInstance()");
		}
		// proceed with creation
		System.out.println("Creating...");
	}

	public static ReflectionSingletonTest getInstance() {
		return instance;
	}
}
//to fix this go to constructor
//we will chk that instance is already created by getInstance we will not allow reflection api