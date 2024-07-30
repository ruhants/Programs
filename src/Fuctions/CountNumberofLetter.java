package Fuctions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountNumberofLetter {

	
	    public static void main(String[] args) {
	        String word = "Hello"; // Replace "Hello" with the word you want to count letters for

	        long lettercount = word.toLowerCase().chars().filter(Character :: isLetter).count();
	        System.err.println(lettercount);;
	        
	        Map<String, Long> map = Arrays.stream(word.split("")).map(String::toLowerCase)
	        		.collect(Collectors.groupingBy(n->n, Collectors.counting()));
	        
	        System.out.println(map);
	        
	        long vowelcount = word.toLowerCase().chars().filter(n-> "aeiou".indexOf(n)!=-1).count();
	        System.out.println(vowelcount);
	        
	        StringBuilder builder = new StringBuilder(word);
	        builder.reverse();
	        System.out.println(builder);
	        
	        char[] c = word.toCharArray();
	        for(int i=c.length-1;i>=0;i--) {
	        	System.out.print(c[i]);
	        }
	        
	        List<String> words = Arrays.asList("Banan", "Apple", "Orange", "Grapes", "Pineapple");

	        // Sorting in natural order
	        List<String> sortedWords = words.stream()
	                                        .sorted()
	                                        .collect(Collectors.toList());
	        System.out.println("Sorted words in natural order: " + sortedWords);
	    }
	    
	}


