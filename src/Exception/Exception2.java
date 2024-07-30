package Exception;

public class Exception2 {
	static int anyMethod() {
		int i = 1;

		try {
			i = i / 0;

			return ++i;
		} catch (Exception e) {
			return ++i;
		} finally {
			return ++i;
		}
	}

	public static void main(String[] args) {
		System.out.println(anyMethod());
	}

}
