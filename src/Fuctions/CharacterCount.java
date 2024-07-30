package Fuctions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {
	public static void main(String[] args) {
		String input = "testing";
			Map<Character, Long> counting = input.chars().mapToObj(c -> (char)c)
					.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			System.out.println(counting);
counting.forEach((character,count)->System.out.println("character :"+ character + " count :"+ count));
	}

}
