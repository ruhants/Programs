package Fuctions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StartingwithOne {
	
	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(10,20,11,44,55,78,119,10);
		
		list.stream().map(s ->s +" ").filter(s->s.startsWith("1")).forEach(System.out::println);
		System.out.println("------------------------------------");
		
	//	list.stream().distinct().forEach(System.out::println);
		
//		System.out.println("------------------------------");
	//	Set<Integer> set = new HashSet<Integer>();
//		
//		list.stream().filter(s->!set.add(s)).forEach(System.out::println);
//		
//		System.out.println("=============================");
		
	//	list.stream().filter(n->set.add(n)).forEach(System.out::println);
	}

}
