package Fuctions;

import java.util.HashMap;

public class CountNumberOFWords {
	
	public static void main(String[] args) {
		
		String str ="hi hello good hello hi good moring th";
		
		String str2[] =str.split(" ");
		
	
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		for(int i=0; i<str2.length;i++) {
			if(map.containsKey(str2[(int) i])) {
				Integer count= map.get(str2[(int) i]);
				map.put(str2[(int) i], count+1);
				
			} else {
				map.put(str2[(int) i], 1);
			}
		}
		System.out.println(map);
	}

}
