package Fuctions;

import java.util.Scanner;

public class StrongPassword {
	
//	public static void main(String[] args) {
//		String password = "Rohan@123";
//		//isStrongpassword();
//		if(isStrongpassword(password)) {
//			System.out.println("stront");
//		}else {
//			System.out.println("weak");
//		}
//		
//		
//	}
//
//	public static boolean isStrongpassword(String password) {
//	
//		
//		if(password.length()< 8) {
//			return false;
//		}
//		
//		boolean hasUppercase = !password.equals(password.toLowerCase());
//		boolean hasDigit = (password.matches("[0-9]*"));
//		boolean hasSpecialCharater = !password.matches("[a-zA-Z0-9]*");
//		
//		
//		return hasDigit && hasUppercase && hasSpecialCharater;
//		
//	}
//	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the password to check if it's strong:");
	        String password = scanner.nextLine();

	        if (isStrongPassword(password)) {
	            System.out.println("Strong password!");
	        } else {
	            System.out.println("Weak password!");
	        }
	    }

	    public static boolean isStrongPassword(String password) {
	        // Check if password length is at least 8 characters
	        if (password.length() < 8) {
	            return false;
	        }

	        // Check if password contains at least one uppercase letter
	        boolean hasUppercase = !password.equals(password.toLowerCase());

	        // Check if password contains at least one digit
	        boolean hasDigit = password.matches(".*[0-9].*");

	        // Check if password contains at least one special character
	        boolean hasSpecialChar = !password.matches("[a-zA-Z0-9 ]*");

	        return hasUppercase && hasDigit && hasSpecialChar;
	    }
	}

