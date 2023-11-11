package singletonpattern;

public class SingletonGlobal {

	public static SingletonGlobal uniqueInstance = new SingletonGlobal();;
	
	private SingletonGlobal() {}
	
	public static SingletonGlobal getInstance() {
		return uniqueInstance;
	}
}
