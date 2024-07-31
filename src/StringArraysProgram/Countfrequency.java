package StringArraysProgram;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Countfrequency {
	
	public static void main(String[] args) {
		Integer[] array = {1,2,3,4,5,5,6,7,8,9,6};
		
			Map<Integer,Long> map  = Arrays.stream(array)
					.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			System.out.println(map);
	}

}
