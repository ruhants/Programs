package Fuctions;

import java.util.HashMap;

public class DistinctCharacterCount {
	
	public static void main(String[] args) {
		
		String inputString = "helllo";
		
		HashMap<Character, Integer> charCount = new HashMap<>();
		
		for(char c:inputString.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c,0 )+1);
		}
		
		System.out.println("distct count :");
		
		for(char c: charCount.keySet()) {
			System.out.println(c + "->"+charCount.get(c));
		}
	}

}
