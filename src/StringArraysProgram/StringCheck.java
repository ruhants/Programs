package StringArraysProgram;

public class StringCheck {
	
	public static void main(String[] args) {
		String s = "test";
		String s1="test";
		String s2 = new String("test");
		String s3 = new String("test");
		System.out.println(s == s1); 
		System.out.println(s == s2); 
		System.out.println(s2 == s3); 
		System.out.println(s==s3);
		
	}

}
