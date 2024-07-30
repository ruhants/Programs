package Fuctions;

public class CheckRotation {
	
	public static boolean checkRotation(String s1,String s2 ) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		String s3 = s1+s1;
		if(s3.contains(s2)) {
			return true;
		}else {
		return false;
		}
	}

	public static void main(String[] args) {
		String s1="abc";
		String s2="bca";
		if(checkRotation(s1,s2)) {
			System.out.println(s2+" rotation "+s1);
		}else {
			System.out.println("not a rotation");
		}
	}
}
