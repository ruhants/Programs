package Fuctions;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class ContainVowels {

	// private static long vowels ;

	public static void main(String[] args) {
//		String input ="Hello";
//		IntStream  stream =input.chars();
//		 
//		List<String> l= Arrays.asList("Hello");
//		System.out.println("Vowels: "+vowels);
//		

//	
//	public static void strinConatainVowels(String input) {
//		
//	int 	vowels =(int) input.chars().asLongStream().filter(ch ->(ch =='a' && ch == 'e' && ch == 'i' && ch =='o' && ch == 'u')).count();
//	}

		String str = "rohan";
		Integer vowelCount = (int) str.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
		System.out.println("Number of vowels in the word: " + vowelCount);

		int[] chaarcount = new int[26];
		str = str.toLowerCase();
		for (char i : str.toCharArray()) {
			if (Character.isAlphabetic(i)) {
				chaarcount[i - 'a']++;
			}
		}

		for (char i = 'a'; i <= 'z'; i++) {
			if (chaarcount[i - 'a'] > 0) {
				System.out.println(i + ":" + chaarcount[i - 'a'] + " times");

			}
		}
	}
	
	Map<String,Integer> vowelCount = new HashMap<String, Integer>();
	  
	
	
	
}