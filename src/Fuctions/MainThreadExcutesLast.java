package Fuctions;

public class MainThreadExcutesLast implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" run method executing");
	}

	public static void main(String[] args) {
		MainThreadExcutesLast excutesLast = new MainThreadExcutesLast();
		Thread t1 = new Thread(excutesLast,"T1");
		Thread t2 = new Thread(excutesLast,"T2");
		Thread t3 = new Thread(excutesLast,"T3");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Thread executes end");
	}
}
