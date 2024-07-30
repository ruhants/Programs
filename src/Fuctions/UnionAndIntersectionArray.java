package Fuctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UnionAndIntersectionArray {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {4, 5, 6, 7, 8};
        
        Set<Integer> union = new HashSet<>();
        union.addAll(Arrays.asList(array1));
        union.addAll(Arrays.asList(array2));
        System.out.println("Union: " + union);
        
        	List<Integer> set = new ArrayList<>(Arrays.asList(array1));
        
        List<Integer> intersect =  Arrays.stream(array2)
        		.filter(set::contains).collect(Collectors.toList());
        System.out.println(intersect +" Intersection");
	}

}
