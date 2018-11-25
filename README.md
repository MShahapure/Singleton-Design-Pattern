# SingletonDesignPattern


It is categorized under creational design patterns.

Sometimes it’s important for some classes to have exactly one instance. There are many objects we only need one instance
of them and if we, instantiate more than one, we’ll run into all sorts of problems like incorrect program behavior, overuse of
resources, or inconsistent results.
You may require only one object of a class, for example, when you are a creating the context of an application, or a thread
manageable pool, registry settings, a driver to connect to the input or output console etc. More than one object of that type
clearly will cause inconsistency to your program.
The Singleton Pattern ensures that a class has only one instance, and provides a global point of access to it. However, although
the Singleton is the simplest in terms of its class diagram because there is only one single class, its implementation is a bit trickier.

Singleton pattern is used for logging, drivers objects, caching and thread pool.
Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype etc.
Singleton design pattern is used in core java classes also, for example java.lang.Runtime.


To implement Singleton pattern, we have different approaches but all of them have following common concepts.

• Private constructor to restrict instantiation of the class from other classes.
• Private static variable of the same class that is the only instance of the class.
• Public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.

Ways to write singleton pattern

• Eager initialization
• Static block initialization
• Lazy initialization
• Thread Safe Singleton
• Double checked locking
• Using Enum

ways to break the singleton pattern:

• Multi-threaded access
• If the class is Serializable.
• If it’s Clonable.
• It can be break by Reflection.
• And also if, the class is loaded by multiple class loaders.

