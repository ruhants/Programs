package Fuctions;

import java.util.List;

public class CountStringGreatereLenTHreee {
	
	public static void main(String[] args) {
		List<String> list = List.of("amanana","anana","nam");
		list.stream().filter(e ->e.length()>3).forEach(System.out::println);
	
	}

}
 