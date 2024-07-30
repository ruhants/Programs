package Fuctions;

public class Myclass implements MyNewInterface{

	@Override
	public void mymethod() {
		// TODO Auto-generated method stub
		
		System.out.println("my new() method");
		
	}
	
	public static void main(String[] args) {
		var obj = new Myclass();
		obj.mymethod();
	}

}
