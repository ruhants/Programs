package ProducerConsumerProblem;

public class MainProConsumer {
	public static void main(String[] args) {
		Shop shop = new Shop();
		new Producer(shop);
		new Consumer(shop);
	}

}
