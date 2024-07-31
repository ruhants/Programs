package StringArraysProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Temp {
	public static void main(String[] args) {
		Integer arr[] = {7,5,8,1,4,2,9,10,2,4,7,4};
		List<Integer> list = Arrays.asList(arr);
		Stream<Integer> result=list.stream().distinct().sorted(Comparator.naturalOrder());
		result.forEach(System.out::println);
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		TreeSet<Integer> tree = new TreeSet<>(list);
		tree.forEach(System.out::println);
	}

}
