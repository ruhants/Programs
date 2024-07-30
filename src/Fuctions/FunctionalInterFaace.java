package Fuctions;


interface MyInterface{
	
 double newMethod();
}

public class FunctionalInterFaace {
	
	public static void main(String[] args) {
		
		MyInterface myInterface;
		
//		MyInterface myInterface = new MyInterface() {
//			
//			@Override
//			public double newMethod() {
//				// TODO Auto-generated method stub
//				return 06.1415;
//			}
//		};
		 //myInterface.newMethod();
		myInterface = ()-> 3.1415;
		
		System.out.println("get value "+ myInterface.newMethod());
	}
}
