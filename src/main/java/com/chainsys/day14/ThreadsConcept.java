package main.java.com.chainsys.day14;

public class ThreadsConcept extends Thread {
	public void run () {
		for(int i=0;i<10;++i) {
			System.out.println(i);
			try {
				ThreadsConcept.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
}