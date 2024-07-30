package StringArraysProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCount {
	
	public static void main(String[] args) {
		int arr[] = {1,2,5,9,2,1,5};
		
//		Integer[] numbers ={1,2,4,5,7,9,2,1,2,5};
//		
//		
//		
//		Map<Integer, Long> input =  Arrays.stream(numbers)
//				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(input);
//		
//		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
//		
//		
//		for(int a :arr)
//		{
//			Integer count = hm.get(a);
//			
//			if(count==null)
//			{
//				hm.put(a, 1);
//			}
//			else
//			{
//				count = count+1;
//				hm.put(a, count);
//			}
//		}	
//		
//		
////		hm.forEach((key,value)->System.out.println(key + " "+value));
//		
//		hm.forEach((key,value)->
//		{
//			if(value > 1)
//			{
//				System.out.println(key + " "+ "repeate : "+value);
//			}
//		});
		
		
	
		int res = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			res = res^arr[i];
		}
		
		System.out.println("result :  "+res);
		
	}

}
