package singletonpattern;

public class SingletonDoubleCheckLock {

	public volatile static SingletonDoubleCheckLock uniqueInstance;
	
	private SingletonDoubleCheckLock() {}
	
	public static SingletonDoubleCheckLock getInstance() {
		if(uniqueInstance == null) {
			synchronized (Singleton.class) {
				if(uniqueInstance == null) {
					uniqueInstance = new SingletonDoubleCheckLock();
				}
			}
		}
		return uniqueInstance;
	}
}
