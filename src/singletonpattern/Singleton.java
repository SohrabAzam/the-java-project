package singletonpattern;

public class Singleton {

	public static Singleton uniqueInstance;
	
	private Singleton() {}
	
	public static synchronized Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}