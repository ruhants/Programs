package Conceptual;

public class Pallindrome {
	
	
	public static boolean isPalindrome(int num) {
		int originalNumber = num;
		int reverseNumber = 0;
		
		while(num>0) {
			int digit = num % 10;
			//System.out.println(digit);
			reverseNumber = reverseNumber * 10 + digit;
			///System.out.println(reverseNumber);
			num=num/10;
			//System.out.println(num);
		}
		
		return originalNumber == reverseNumber;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 121;
		
		if(isPalindrome(num)) {
			System.out.println(num + " "+" is pallindrome");
		}else {
			System.out.println(num +" " +" not pallindrome");
		}

	}

}
