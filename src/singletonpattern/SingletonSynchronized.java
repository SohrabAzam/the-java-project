package singletonpattern;

public class SingletonSynchronized {

	public static SingletonSynchronized uniqueInstance;
	
	private SingletonSynchronized() {}
	
	public static synchronized SingletonSynchronized getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new SingletonSynchronized();
		}
		return uniqueInstance;
	}
}
