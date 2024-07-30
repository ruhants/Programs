package Fuctions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChecker {

	public static void main(String[] args) {
		
		String input = "apple,banana,orange";
		String[] split = input.split(",");
		
		Set<String> word = new HashSet<>();
//		
//		for (String item : split) {
//			if(!word.add(item)) {
//				System.out.println("1");
//			} 
//			
//		}
//		
//		
		
		
	
	
boolean foundDuplicate = false;
        
//        for (String item : split) {
//            if (!word.add(item)) {
//                if (!foundDuplicate) {
//                	foundDuplicate = true;
//                    System.out.println("1");
//                    
//                }
//            }
//        }
//        
//        if (!foundDuplicate) {
//        	
//            System.out.println("no duplicate");
//        }
   
	
	//-------------------------------------------
	
	
	
	for (String words : split ) {
		if(!word.add(words)) {
			if(!foundDuplicate) {
				foundDuplicate = true;
				System.out.println("1");
			}
			
		}
		
	}
	if(!foundDuplicate) {
		System.out.println("duplicate not found");
	}
}
}

