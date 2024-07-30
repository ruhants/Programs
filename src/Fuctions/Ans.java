package Fuctions;

public class Ans{
	public static void main(String[] args) {
		int x = 2, y = 5;
		y = jumble(x,y);
		x = jumble(x, y);
		System.out.println(x);

	}

	public static int jumble(int x, int y) {
		x = 2 * x + y;
		return x;

	}
}
