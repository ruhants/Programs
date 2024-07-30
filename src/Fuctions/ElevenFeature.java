package Fuctions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class ElevenFeature {
	public static void printCharOccurrence(String str) {
		int[] charCount = new int[23];
		for (char c : str.toCharArray()) {
			char lowerCase = Character.toLowerCase(c);
			if (lowerCase >= 'a' && lowerCase <= 'z') {
				charCount[lowerCase - 'a']++;
			}
		}

		for (int i = 0; i < 23; i++) {
			char ch = (char) ('a' + i);
			if (charCount[i] > 0) {
				System.out.println(ch + ": " + charCount[i]);
			}
		}
	}

	public static void countOccurenc(String str) {
		int[] characterCount = new int[26];
		for (char c : str.toCharArray()) {
			char tolwcase = Character.toLowerCase(c);
			if (tolwcase >= 'a' && tolwcase <= 'z') {
				characterCount[tolwcase - 'a']++;

			}
		}

		for (int i = 0; i < 26; i++) {
			char ch = (char) ('a' + i);
			if (characterCount[i] > 0) {
				System.out.println(ch + " " + characterCount);
			}
		}

	}

	public static void main(String[] args) throws Exception {
//		        HttpClient	 client = HttpClient.newHttpClient();
//		        HttpRequest request = HttpRequest.newBuilder()
//		            .uri(new URI("https://example.com"))
//		            .GET()
//		            .build();
//		        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//		        System.out.println("Response code: " + response.statusCode());
//		        System.out.println("Response body: " + response.body());

		// Before Java 11
		BinaryOperator<Integer> add = (Integer a, Integer b) -> a + b;
		System.out.println("Sum: " + add.apply(5, 3));

		// With Java 11 (using local-variable )
		BinaryOperator<Integer> multiply = (var a, var b) -> a * b;
		System.out.println("Product: " + multiply.apply(5, 3));

		String str = "Hello World ";
		System.out.println(str.stripTrailing());
		System.out.println(str.repeat(4));
		System.out.println(str.indexOf('W'));

		Object count = str.chars().filter(Character::isLetter).count();
		System.out.println(count);

//				Map<Character,Integer> charcount =  new HashMap<>();
//				
//				str.chars().mapToObj(c-> (char)c).forEach(c->charcount.merge(c, 1,Integer::sum));
//				
//				//charcount.forEach((character,count)-> System.out::println(character+" "+ count));

		String sqlQuery = """
				SELECT *
				FROM employees
				WHERE department = 'IT'
				ORDER BY last_name;
				""";
 
		String sh= "  SELECT * "
				+ "FROM employees WHERE "
				+ "department = 'IT' "
				+ "ORDER BY last_name;";
		
		
		Map<Object, Long> charcount = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		charcount.forEach((ractecha, occur) -> System.out.println(ractecha + " " + occur));

		List<Integer> list = Arrays.asList(1, 4, 6, 8, 9, 10, 12, 13, 13);
		list.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
		list.stream().sorted().distinct().forEach(System.out::println);

		printCharOccurrence(str);

		countOccurenc(str);

	}

}
