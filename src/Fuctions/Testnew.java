package Fuctions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//List<String> list = Arrays.asList("Ravi Kumar", 
//"Divya Narayan", "Yogesh Shesh", "Naresh", "Hari Rao", "Deepika", null);
//Name length should be less than 10 and name should not have spaces
public class Testnew {
	
	
	
	
	public static void main(String[] args) {
		
		 List<String> list = Arrays.asList("Ravi Kumar", "Divya Narayan",
				 "Yogesh Shesh", "Naresh", "Hari Rao", "Deepika", null);

	        List<String> result = list.stream()
	                                .filter(name -> name != null)
	                                .map(name -> name.replaceAll("\\s+",""))  
	                                .collect(Collectors.toList());

	        System.out.println(result);
		
		
		
	}

}

