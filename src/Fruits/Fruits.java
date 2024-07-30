package Fruits;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Fruits {
	
static	List<String> list = List.of("Apple", "Orange", "grapes","Apple", "Orange", "grapes", "Apple", "Orange","Apple", "Orange");
	
static	long Threshold = 2;
	
	public static void main(String[] args) {
		java8Style();
	}

	private static void java8Style() {
//		System.out.println(Collections.frequency(list, "Apple"));
//		
//		System.out.println("---------------------");
		
//		 Set<String> distinct = new HashSet<>(list);
//	        for (String s: distinct) {
//	        
//	            System.out.println(s + ": " + Collections.frequency(list, s));
//	            System.out.println("------------------------");
	            
	            
	             
	            Map<String, Long> countingMap = list.stream()
	                    .collect(Collectors.groupingBy(i->i,
	                            Collectors.counting()));
	            
	            System.out.println(countingMap);

	            countingMap.entrySet()
	                    .stream()
	                    .filter(a -> a.getValue() > Threshold)
	                    .map(Map.Entry::getKey).forEach(System.out::println);
	}

}


