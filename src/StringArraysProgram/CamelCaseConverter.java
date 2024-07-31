package StringArraysProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CamelCaseConverter {
	
	public static void main(String[] args) {
		List<String> word = Arrays.asList("hello world", "java streams", "convert text", null);
		
		List<String> camelCaseWords= word.stream().
				filter(n->n!=null).map(CamelCaseConverter::convertToCamelCase)
				.collect(Collectors.toList());
		
		camelCaseWords.forEach(System.out::println);
	}
	
	public static String convertToCamelCase(String input) {
		StringBuilder builder = new StringBuilder();
		boolean capitalNext = false;
		
		for(char c : input.toCharArray()) {
			if(c==' ') {
				capitalNext= true;
			} else {
				if (capitalNext) {
					builder.append(Character.toUpperCase(c));
                    capitalNext = false;
                } else {
                	builder.append(Character.toLowerCase(c));
                }
            }
        }

        return builder.toString();
	}	
		
	
	}


