package ProducerConsumerProblem;

public class Shop {
	
	int i;
	boolean bool = false;
	
	public synchronized void set(int i) throws InterruptedException {
		while(bool) {
			wait();
		}
		this.i=i;
		bool = true;
		System.out.println("Producer "+ i);
		notify();
	}
	public synchronized void get(int i) throws InterruptedException {
		while(!bool) {
			wait();		
		}
		bool = true;
		System.out.println("Consumer "+i);
		notify();
	}

}
