package com.test;

import com.test.cloneSingleton.CloneSingleton;
import com.test.lazyInitializedSingleton.LazyInitializedSingleton;

public class TestSingleton {

	public static void main(String[] args) throws Exception {
	
		/*
		//Eager Initialized Singleton
		
		//EagerInitializedSingleton s1=new EagerInitializedSingleton();
		
		EagerInitializedSingleton s1=EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton s2=EagerInitializedSingleton.getInstance();
		
		System.out.println("Object: s1 "+"Hashcode: "+s1.hashCode());
		System.out.println("Object: s2 "+"Hashcode: "+s2.hashCode());
		
		*/
		
		
		/*
		//Static Block Singleton
		
		StaticBlockSingleton s1 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton s2 = StaticBlockSingleton.getInstance();
		
		System.out.println("Object: s1 "+"Hashcode: "+s1.hashCode());
		System.out.println("Object: s2 "+"Hashcode: "+s2.hashCode());
		
		*/
		
		//Lazy Initialized Singleton
		
//		LazyInitializedSingleton s1 = LazyInitializedSingleton.getInstance();
//		LazyInitializedSingleton s2 = LazyInitializedSingleton.getInstance();
//
//		System.out.println("Object: s1 " + "Hashcode: " + s1.hashCode());
//		System.out.println("Object: s2 " + "Hashcode: " + s2.hashCode());
		
		
		//multi-threading
//		ExecutorService service=Executors.newFixedThreadPool(2);
//		service.submit(TestSingleton::useSingleton);
//		service.submit(TestSingleton::useSingleton);
//		
//		service.shutdown();
		
		
		//reflection
		
//		ReflectionSingletonTest s1 = ReflectionSingletonTest.getInstance();
//		ReflectionSingletonTest s2 = ReflectionSingletonTest.getInstance();
//
//		System.out.println("Object: s1 " + "Hashcode: " + s1.hashCode());
//		System.out.println("Object: s2 " + "Hashcode: " + s2.hashCode());
//
//		System.out.println("\nUsing reflection ");
//		Class clazz = Class.forName("com.test.reflection.ReflectionSingletonTest");// load my class
//		// from this class get declared Constructor [default ctor]
//		Constructor<ReflectionSingletonTest> ctor = clazz.getDeclaredConstructor();
//		// since its private we cannot invoke it
//		ctor.setAccessible(true);// lets u violate encapsulation in java & change access modifiers so changing constructor to public
//		
//		// invoking that ctor & creating new singleton here s3
//		ReflectionSingletonTest s3 = ctor.newInstance();
//
//		System.out.println("Object: s3 " + "Hashcode: " + s3.hashCode());
//		// if it shows same hashcode as s1 & s2 the we are good singleton is working fine
//		// if it shows different hashcode we have created new instanse & break singleton
//		
		
		
		//Serialization

//		SerializedSingleton s1 = SerializedSingleton.getInstance();
//		SerializedSingleton s2 = SerializedSingleton.getInstance();
//
//		System.out.println("Object: s1 " + "Hashcode: " + s1.hashCode());
//		System.out.println("Object: s2 " + "Hashcode: " + s2.hashCode());
//
//		System.out.println("serializing and de-serializing...");
//		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("filename.ser"));
//		objectOutputStream.writeObject(s2);
//
//		// deserialization
//		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("filename.ser"));
//		SerializedSingleton s3 = (SerializedSingleton) objectInputStream.readObject();
//
//		System.out.println("Object: s3 " + "Hashcode: " + s3.hashCode());		
		
		
	
		
		//clone
		CloneSingleton s1 = CloneSingleton.getInstance();
		CloneSingleton s2 = CloneSingleton.getInstance();

		System.out.println("Object: s1 " + "Hashcode: " + s1.hashCode());
		System.out.println("Object: s2 " + "Hashcode: " + s2.hashCode());
		
		CloneSingleton s3=(CloneSingleton) s2.clone();
		System.out.println("Object: s3 " + "Hashcode: " + s3.hashCode());
		
	
		}
	
	 static void useSingleton() {
		LazyInitializedSingleton lazySingleton=LazyInitializedSingleton.getInstance();
		System.out.println("Object: lazySingleton " + "Hashcode: " + lazySingleton.hashCode());
	}

}
