package Fuctions;



interface Greeting {
	void greet();
}

class Main  {
	public static void main(String[] args) {
		// Using an anonymous class
		Greeting anonymousGreeting = new Greeting() {
			@Override
			public void greet() {
				System.out.println("Hello");
			}
		};

		//  a lambda expression
		Greeting lambdaGreeting = () -> System.out.println("Hello");

		anonymousGreeting.greet(); 
	//	lambdaGreeting.greet(); 
		
		
	}
}
