package ProducerConsumerProblem;

public class Producer implements Runnable {

	private Shop shop;
	public Producer(Shop shop) {
     this.shop = shop;
    Thread producers= new Thread(this, "Producer: ");
    producers.start();
	}

	@Override
	public void run() {
		int i=0;
		// TODO Auto-generated method stub
		while (true) {
         try {
			shop.set(i++);
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	}

}
