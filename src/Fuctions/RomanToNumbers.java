package Fuctions;

class RomanToNumbers {

	public static void main(String[] args) {
		int result = RomanToNumbers.romantonumber("XLIV");
		System.out.println(result);

	}

	public static int romantonumber(String string) {
		int ans = 0;
		int previous = 0;

		for (int i = string.length() - 1; i >= 0; i--) {

			int num = switch (string.charAt(i)) {
			case 'I' -> 1;
			case 'V' -> 5;
			case 'X' -> 10;
			case 'L' -> 50;
			case 'C' -> 100;
			case 'D' -> 500;
			case 'M' -> 1000;
			// default -> throw new IllegalArgumentException("Unexpected value: " +
			// string.charAt(i));
			default -> throw new IllegalArgumentException("Unexpected value: " + string.charAt(i));
			};

			
		if (num < previous) {
            ans = ans -num;
        } else {
            ans = ans +num;
        }

        // Update the previous numeral
		previous = num;
    }

		return ans;

	}
}
