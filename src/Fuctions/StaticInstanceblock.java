package Fuctions;

public class StaticInstanceblock {
	
	{
		System.out.println("instance bock");
	}
	
	static {
		System.out.println("static block");
	}
	
	public StaticInstanceblock() {
		System.out.println("constructor block");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		StaticInstanceblock staticInstanceblock = new StaticInstanceblock();
	}

}
