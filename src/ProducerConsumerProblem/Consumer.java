package ProducerConsumerProblem;

public class Consumer implements Runnable {
  
	private Shop shop;
	public Consumer(Shop shop) {
		Thread consumer  = new Thread(this,"Consumer: ");
		this.shop = shop;
		consumer.start();

	}

	@Override
	public void run() {
		int i =0;
		// TODO Auto-generated method stub
		while (true) {
        try {
			shop.get(i++);
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	}

}
