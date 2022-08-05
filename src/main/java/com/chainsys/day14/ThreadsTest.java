package main.java.com.chainsys.day14;

public class ThreadsTest {

	public static void main(String[] args) throws InterruptedException {
		ThreadsConcept t1 = new ThreadsConcept();
		
		System.out.println("Thread Name: "+t1.getName()+
				"\nIsAlive: "+t1.isAlive()+"\nState: "+t1.getState()+"\n");
		t1.start();
		System.out.println("Thread Name: "+t1.getName()+
				"\nIsAlive: "+t1.isAlive()+"\nState: "+t1.getState()+"\n");
		t1.sleep(10000);
		System.out.println("Thread Name: "+t1.getName()+
				"\nIsAlive: "+t1.isAlive()+"\nState: "+t1.getState()+"\n");

	}

}
