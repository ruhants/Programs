package Fuctions;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class EnhancedForloop {

	static Map<String, String> places = new HashMap();

	// preparing our data
	public static  Map<String, String> getPlaces() {

		// add places and country to the list
		places.put("Kathmandu", "Nepal");
		places.put("Pokhara", "Nepal");
		places.put("Delhi", "India");
		places.put("New York", "USA");
		places.put("Nigeria", "Africa");
		places.put("bengaluru", "India");

		return places;
	}

	public static void main(String[] args) {

		// System.out.println("Places from Nepal:");
		// Filter places from Nepal
		Map<String, String> myPlaces2 = getPlaces().entrySet().stream().filter(x -> "India".equals(x.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println("Filtered map starts with specific country : " + myPlaces2);

		System.out.println("-------------------------");

		System.out.println(getPlaces());

	}

}
