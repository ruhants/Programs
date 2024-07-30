package StringArraysProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArray {
	
	public static void main(String[] args) {
		Integer[] array1 = {1,2,3,4};
		Integer[] array2 = {5, 2, 6, 4, 3};
		
		List<Integer> temp = new ArrayList<>(Arrays.asList(array1));
		temp.addAll(Arrays.asList(array2));
		Integer[] arr3 = temp.toArray(new Integer[0]);
		List<Integer> result = Arrays.asList(arr3).stream().distinct().toList();
		
	
		System.out.println((result));
		
	}

}
