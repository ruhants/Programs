package Fuctions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueElemntsInArray {
	

	
	 public static void findDuplicatesUsingJava8(Integer[] inputArray) 
	    {   
	        Set<Integer> uniqueElements = new HashSet<>();
	          
	        Set<Integer> duplicateElements =  Arrays.stream(inputArray)
	                                                .filter(i -> !uniqueElements.add(i))
	                                                //.boxed()
	                                                .collect(Collectors.toSet());		
	        System.out.println(duplicateElements);
	    }
	      
	    public static void main(String[] args) 
	    {
	        Integer[] inputArray = {111, 333, 555, 777, 333, 444, 555};
	        findDuplicatesUsingJava8(inputArray);

}
}
