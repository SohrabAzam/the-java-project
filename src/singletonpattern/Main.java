package singletonpattern;

public class Main {

	public static void main(String[] args) {

		Singleton s1 = null;
		for(int i= 1; i<10 ; i++) {
			SingletonThread st1 = new SingletonThread();
			SingletonThread st2 = new SingletonThread();
			SingletonThread st3 = new SingletonThread();
			SingletonThread st4 = new SingletonThread();
			st1.start();
			st2.start();
			st3.start();
			st4.start();
		
		}
		
		
	}

}
