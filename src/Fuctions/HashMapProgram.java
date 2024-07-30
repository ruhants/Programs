package Fuctions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapProgram {

	public static void main(String[] args) {
		 Map<Integer,String> map = new HashMap<>();
		 
		 map.put(1, "akash");
		 map.put(2, "bene");
		 map.put(4, "cana");
		 
		 
//		 Iterator itr = map.entrySet().iterator();
//		 while (itr.hasNext()) {
//			Map.Entry type = (Entry) itr.next();
//			//System.out.println("key :"+type.getKey() +"value :"+type.getValue());
//			
//			System.out.println("-----------------------------");
			
			
			
			for(Map.Entry entry : map.entrySet()) {
				System.out.println("key :"+entry.getKey() +"value :"+entry.getValue());
				
			}
			
		}
	}

