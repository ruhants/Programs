package Conceptual;

public class CreationOfThread extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName() + " hello");

	}

	public static void main(String[] args) {
		CreationOfThread creationOfThread = new CreationOfThread();
		creationOfThread.start();
	}

}
 class Myrunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " hello");

		
	}
	public static void main(String[] args) {
		Myrunnable myrunnable = new Myrunnable();
		Thread thread = new Thread(myrunnable);
		thread.start();
		
		
		  Greeting greeting = new Greeting() {
	         
	            public void sayHello() {
	                System.out.println("Hello, world!");
	            }
	        };
	}
	 
 }