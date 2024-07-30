package StringArraysProgram;

import java.util.Arrays;
import java.util.List;

public class DistinctofArray {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 3, 4, 5, 6, 6, 7, 2);
		List<Integer> result = num.stream().distinct().toList();
		System.out.println(result);
		
		int array[] = {1, 2, 3, 4, 5};
		int sum = Arrays.stream(array).sum();
		System.out.println(sum);
	}
}
