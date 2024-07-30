package overloadziq;

class Aaa {

	public Aaa(int i) {
		System.out.println(myMethod(i));
	}

	int myMethod(int i) {
		return ++i + --i;
	}
}

class Bbb extends Aaa {
	public Bbb(int i, int j) {
		super(i * j);

		System.out.println(myMethod(i, j));
	}

	int myMethod(int i, int j) {
		return myMethod(i * j);
	}
}

public class Overload5 {
	public static void main(String[] args) {
		Bbb b = new Bbb(12, 21);
	}
}
