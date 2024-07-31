package StringArraysProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstLetterToUpperCase {
	public static void main(String[] args) {
		
	List<String> words = Arrays.asList("hello world", "java streams", "convert text",null);

    List<String> capitalizedWord = words.stream()
    	.filter(word->word!=null)
        .map(word -> word.replace(" ", "")) // Remove spaces
        .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
        .collect(Collectors.toList());

    System.out.println(capitalizedWord); 
}
}