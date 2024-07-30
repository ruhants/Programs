package Fuctions;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintFirstLetterCapital {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("rohan");
		list.stream().map(name -> name.substring(0,1).toUpperCase()+ name.substring(1)).collect(Collectors.toList());
		System.out.println(list);
	}

}
