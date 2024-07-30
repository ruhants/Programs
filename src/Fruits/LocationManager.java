package Fruits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LocationManager {
    public static void main(String[] args) {
        // Given input list
        List<String> locations = new ArrayList<>();
        locations.add("BOston, MA,02114");
        locations.add("San Sanfransisco , CA,94016");
        locations.add("LasVegas,NV,88901");

        // Step 1: Add the location "Baltimore,MD,21270" to the list
        locations.add("Baltimore,MD,21270");

        // Step 2: Remove any location with zip code starting with 0
        locations.removeIf(location -> {
            String[] parts = location.split(",");
            return parts[2].trim().startsWith("0");
        });

        // Step 3: Sort the list alphabetically by city, then by state, then by zip code
        Collections.sort(locations, new Comparator<String>() {
            @Override
            public int compare(String loc1, String loc2) {
                String[] parts1 = loc1.split(",");
                String[] parts2 = loc2.split(",");
                String city1 = parts1[0].trim();
                String city2 = parts2[0].trim();
                String state1 = parts1[1].trim();
                String state2 = parts2[1].trim();
                String zip1 = parts1[2].trim();
                String zip2 = parts2[2].trim();

                int cityCompare = city1.compareToIgnoreCase(city2);
                if (cityCompare != 0) {
                    return cityCompare;
                }
                int stateCompare = state1.compareToIgnoreCase(state2);
                if (stateCompare != 0) {
                    return stateCompare;
                }
                return zip1.compareTo(zip2);
            }
        });

        // Step 4: Format each location into a string "city,state,zip"
        // Step 5: Convert the list to a single string
        StringBuilder result = new StringBuilder();
        for (String location : locations) {
            result.append(location.trim()).append("\n");
        }

        // Print the final result string
        System.out.print(result.toString());
    }
}
