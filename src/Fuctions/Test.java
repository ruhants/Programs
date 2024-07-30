package Fuctions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
//public static void main(String[] args) { 
//	int number = 371, originalNumber, remainder, result = 0;
//
//        originalNumber = number;
//
//        while (originalNumber != 0)
//        {
//            remainder = originalNumber % 10;
//            System.out.println(remainder + "remainder" );
//            result += Math.pow(remainder, 3);
//            System.out.println(result + "resulr");
//            originalNumber /= 10;
//            System.out.println(originalNumber + "original");
//            continue;
//        }
//
//        if(result == number)
//            System.out.println(number + " is an Armstrong number.");
//        else
//            System.out.println(number + " is not an Armstrong number.");
//    }	 
//	 
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 8);
		List<Integer> resulteven = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(resulteven);

		List<Integer> resultodd = numbers.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println(resultodd);

		List<String> repeatedWords = Arrays.asList("Java", "Python", "C#", "Java", "Kotli", "Python");
		repeatedWords.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

//		Map<Object, Long> occurence = repeatedWords.stream()
//				.collect(Collectors.groupingBy(i -> i, Collectors.counting()));
//
//		occurence.forEach((key, value) -> {
//			if (value > 1) {
//				System.out.println(key);
//			}
//
//		});

		
	}
}
