package StringArraysProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElements {
	public static void main(String[] args) {
		 Integer[] array1 = {1, 2, 3, 4, 5};
	        Integer[] array2 = {4, 5, 6, 7, 8};
	        List<Integer> commonElements = findCoomonElement(array1, array2);
	        System.out.println(commonElements);
		
	}
	
	public static  List<Integer>  findCoomonElement(Integer[] array1,Integer[] array2){
		
		
		  List<Integer> list1 = Arrays.asList(array1);
	        List<Integer> list2 = Arrays.asList(array2);
	        List<Integer> common = list1.stream().collect(Collectors.toList());
	        
	        common.retainAll(list2);

	        return common;
		
	}

}
