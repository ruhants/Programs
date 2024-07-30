package Fuctions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//string str=hi hello
public class ReverseStringwithspace {
//	static void reverse(String str) {

//		char[] inputArray = str.toCharArray();
//		char[] result = new char[inputArray.length];
//
//		IntStream.range(0, inputArray.length).filter(i -> inputArray[i] == ' ')
//		.forEach(i -> result[i] = ' ');//["ll lllll lllll lll]
//
//		List<Character> list = new ArrayList<>();
//		for (char c : inputArray) {
//			if (c != ' ') {
//				list.add(c);
//			}
//		}
//		int j = list.size() - 1;
//		for (int i = 0; i < result.length; i++) {
//			if (result[i] != ' ') {
//				result[i] = list.get(j--);
//			}
//		}
//		System.out.println(String.valueOf(result));
//	}
//	public static void main(String[] args) {
//		reverse("hi hello every one");
//	}
	
	static void revrse(String str) {
		char[] inputArray = str.toCharArray();
		char[] result =new char[inputArray.length];
		
		IntStream.range(0, inputArray.length).filter(i -> inputArray[i]==' ')
		.forEach(i -> result[i]=' ');
		
		
		
	}
}
