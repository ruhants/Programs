package inheritance;

class Aa {
	int methodOfA(int i) {
		i /= 10;

		return i;
	}
}

class Bb extends Aa {
	int methodOfB(int i) {
		i *= 20;

		return methodOfA(i);
	}
}

public class Inheritance3 {
	public static void main(String[] args) {
		Bb b = new Bb();

		System.out.println(b.methodOfB(100));
	}
}
