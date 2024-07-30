package Fuctions;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class SquareRoot {
	public static void main(String[] args) {
		List<Integer> al= Arrays.asList(1,5,7,9,11,12);
		
		al.stream().map(n->n*n).forEach(System.out::println);
		
		System.out.println("-----------------------------");
		
		al.stream().map(n->n*n).filter(n->n>=100).forEach(System.out::println);
		System.out.println("---------------------------------");
		
		OptionalDouble optionalDouble = al.stream().mapToInt(n->n*n).filter(n->n>=100).average();
		System.out.println(optionalDouble);
	}

}
