package StringArraysProgram;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringRepeat {
	public static void main(String[] args) {
		String str = "hi every one ";
		Map<Character, Long> counting= str.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	counting.forEach((caharacter,countin)-> System.out.println(caharacter +" "+ countin));
		System.out.println(counting);
		
	}

}
