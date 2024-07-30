package StringArraysProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestArray {
	
	 public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 
				3, 4, 5, 6, 6, 7, 2);
		
		Optional<Integer> secondLargest = num.stream().distinct().sorted(Comparator.reverseOrder())
				.skip(2).findFirst();
		secondLargest.ifPresent(numbers->System.out.println("second largest :" +numbers));
		
		int[] array = {7, 5, 7, 2, 8, 6, 8};
		int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>first) {
				second = first;
			first= array[i];
		}else if (array[i]> second && array[i]!=first) {
			second = array[i];
		}
		
	}
		System.out.println(second);
	 }
}
