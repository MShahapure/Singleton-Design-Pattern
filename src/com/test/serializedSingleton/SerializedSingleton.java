package com.test.serializedSingleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

@SuppressWarnings("serial")
public class SerializedSingleton implements Serializable {

	public static final SerializedSingleton instance = new SerializedSingleton();

	private SerializedSingleton() {
		System.out.println("Creating...");
	}

	public static SerializedSingleton getInstance() {
		return instance;
	}
	
	//to prevent form destroying singleton
	private Object readResolve() throws ObjectStreamException{
		System.out.println(".. read resolve ..");
		return instance;
	}
	
	//this will override deserialize & give us instance back
}

//The problem with above serialized singleton class is that whenever we deserialize  it, it will create a new instance of the class.
//So it destroys the singleton pattern, to overcome this scenario all we need to do it provide the implementation of readResolve() method.
//when deserialization happens it is guaranteed that java will call readResolve method that u provide just after deserialization of the obj