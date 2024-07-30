package Fuctions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberCount {
	public static void main(String[] args) {
		int[] arrays = {1, 2, 3, 4, 5, 1, 2, 3, 4, 1, 2, 1};
		
		Map<Integer,Long> numbers = Arrays.stream(arrays).boxed()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		numbers.forEach((number,count)->
		System.out.println("numbers " +number+ " occurance " +count));
		
	}

}
