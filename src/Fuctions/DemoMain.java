package Fuctions;



interface Greeting1 {
	void greet();
	
	//void he();
}

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greeting1 anonymousGreeting = new Greeting1() {
			public void greet() {
				System.out.println("Hello");
			}

//			@Override
//			public void he() {
//				// TODO Auto-generated method stub
//				
//			}
		};

		//  a lambda expression
		//Greeting lambdaGreeting = () -> System.out.println("Hello");

		anonymousGreeting.greet(); 
		
		Greeting1 lambdaGreeting = () -> System.out.println("Hello, hey");
		
		lambdaGreeting.greet(); 
		

	}

}
