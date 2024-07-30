package Conceptual;
/*ASCII_Sum: Write a program to find sum of ascii values of first and last character from
a given string
Note: Except alphabets, If the string has any other character including space, output
should be 1.
Assumptions:
1) There will be atleast 2 characters in the string. 2) Given string can have both uppercase and lowercase characters
Example 1:
Input Malayalam Output: 186
Explanation:
In the given string Malayalam M and m' are first & last characters of the string, whose ascil values are 77 & 109 respectively. Sum of these ascil value would be 186,
Example 2:
input fruits are good 
Output: 1
Explanation: As there are spaces in the given string output would be 1.*/

public class ASCII_Sum {
	static String inputString = "Malayalam";

	public static void main(String[] args) {
		char[] ch = inputString.toCharArray();
		int sum = getASCII_Sum(inputString);
		System.out.println("Output: " + sum);
	}

	private static int getASCII_Sum(String input) {
		// if we need to count asci with having white spaces Remove spaces from the
		// input string
		// input = input.trim();
		char[] ch = inputString.toCharArray();

		// Check if the input string contain space
		for (int i = 0; i < ch.length; i++) {
			if (Character.isWhitespace(inputString.charAt(i))) {
				return 1;
			}
		}
		char firstChar = input.charAt(0);
		char lastChar = input.charAt(input.length() - 1);

		// Check if firstChar and lastChar are alphabets
		if (!Character.isLetter(firstChar) || !Character.isLetter(lastChar)) {
			return 1;
		}
		// Calculate and return the sum of ASCII values of firstChar and lastChar
		return (int) firstChar + (int) lastChar;
	}
}
