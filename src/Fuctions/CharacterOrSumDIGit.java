package Fuctions;

public class CharacterOrSumDIGit {

	 public static String findCharsOrDigitSum(String input, int input2) {
	        if (input == null || input.isEmpty()) {
	            return null;
	        }

	        if (input2 == 0) {
	            int digitSum = 0;
	            for (char c : input.toCharArray()) {
	                if (Character.isDigit(c)) {
	                    digitSum = digitSum + Character.getNumericValue(c);
	                }
	            }
	            return String.valueOf(digitSum);
	        } else if (input2 == 1) {
	            StringBuilder alphabets = new StringBuilder();
	            for (char c : input.toCharArray()) {
	                if (Character.isAlphabetic(c)) {
	                    alphabets.append(c);
	                }
	            }
	            return alphabets.toString();
	        } else {
	            return null; // Invalid input2 value
	        }
	    }

	    public static void main(String[] args) {
	        String input = "a1b2c3d4";
	        int input2 = 0;

	        String result = findCharsOrDigitSum(input, input2);
	        System.out.println("Result: " + result);
	    }
}
