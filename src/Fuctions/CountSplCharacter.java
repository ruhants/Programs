package Fuctions;

public class CountSplCharacter {
	public static void main(String[] args) {
		int count = 0;

		String str = "namaste@&123#";
		String splchremove = "";

////		for(Character ch :str.toCharArray()) {
////			if(str.charAt(ch)>64 && str.charAt(ch)<=122) {
////				splchremove += str.toCharArray();
////				System.out.println(splchremove);
////			}
//		}

		for (Character c : str.toCharArray()) {
			if (!c.isLetterOrDigit(c) && !c.isWhitespace(c)) {
				System.out.println(c);
				count++;
			}
			
		}

		if (count == 0) {
			System.out.println("not present");

		} else {
			System.out.println("total number spl character :" + count);
		}

	}

}
