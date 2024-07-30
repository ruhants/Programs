package overloadziq;

class X {
	void method(int a) {
		System.out.println("ONE");
	}

	void method(double d) {
		System.out.println("TWO");
	}
}

class Y extends X {
	@Override
	void method(double d) {
		System.out.println("THREE");
	}
}

public class Overload3 {
	public static void main(String[] args) {
		
		X x = new Y();
		x.method(0);
		//X.super.method(0.0);
		new Y().method(100);
	}
}
