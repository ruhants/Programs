package Fuctions;

public class CountIntegers {
	public static void main(String[] args) {
		
	
	 int count = 0, num = 02134;

	    while (num != 0) {
	      // num = num/10
	      num /= 10;
	      ++count;
	    }

	    System.out.println("Number of digits: " + count);
	  }

}