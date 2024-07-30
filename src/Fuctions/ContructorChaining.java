package Fuctions;

public class ContructorChaining {
	ContructorChaining() {
		this(20);
		System.out.println(0);
	}

	ContructorChaining(int a) {
		this(90.90f);
		System.out.println(6);
	}

	public ContructorChaining(float a) {
		this(90.90);
		System.out.println(12);
	}

	public ContructorChaining(double a) {
		// TODO Auto-generated constructor stub
		System.out.println(17);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContructorChaining();
	}

}
