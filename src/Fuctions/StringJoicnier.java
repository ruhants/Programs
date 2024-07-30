package Fuctions;

import java.util.StringJoiner;

public class StringJoicnier {
	

	
	public static void main(String[] args) {
		StringJoiner sj1= new StringJoiner(":");
		
		sj1.add("A").add("B").add("C");
		System.out.println(sj1);
	}

}
