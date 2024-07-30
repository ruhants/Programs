package StringArraysProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondHighestSlary {
	
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		
		map.put("Rohan", 1000);
		map.put("Mohan", 7000);
		map.put("Vinod", 10000);
		map.put("rahagav", 11000);
		map.put("arun", 19000);
		map.put("mithun", 21000);
		
		List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		
		
		entries.sort((entry1,  entry2)-> entry1.getValue().compareTo(entry2.getValue()));
		System.out.println(entries);
		Map.Entry<String,Integer> map2 = entries.get(1);
		System.out.println(map2);
	}

}
