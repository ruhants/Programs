package Conceptual;

import java.util.HashMap;
import java.util.Map;

public class HashmapExamplr {
	public static void main(String[] args) {
		HashMap<Integer,String> hashMap = new HashMap<>();
		
		hashMap.put(null, "Apple");
		hashMap.put(null, "Banana");
		hashMap.put(3, "Oranage");
		hashMap.put(4, "Mango");
		hashMap.put(5, "Pine");
		hashMap.put(6, "Grapes");
		
		for(Map.Entry<Integer, String >  entry :hashMap.entrySet()) {
			System.out.println( entry.getKey()+ " "+entry.getValue());
			
			
		}
		hashMap.forEach((key,value)-> System.out.println(key+" "+ value));
	}

}
