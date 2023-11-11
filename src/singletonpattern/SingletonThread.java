package singletonpattern;

public class SingletonThread extends Thread {
	
	Singleton s1 = null;
	public SingletonThread() {
		super();
	}
	
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			s1 = Singleton.getInstance();
			if(i==0 || i==999)
				System.out.println(this.getId()+ " " + s1);
		}
	}
	
}
