package Fuctions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EvenUsingjava8 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,25,90,99);
		list.stream().filter(n->n% 2==0).forEach(System.out::println);
		
		System.out.println("----------------------------");
		//list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
	}

}
