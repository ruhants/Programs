package StringArraysProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSpecificElement {

	public static void main(String[] args) {

		Integer[] array = { 1, 2, 3, 4, 5 };
		int elementToRemove = 3;

		List<Integer> list = new ArrayList<>(Arrays.asList(array));

		boolean removed = list.remove(Integer.valueOf(elementToRemove));

		if (removed) {

			array = list.toArray(new Integer[0]);

			System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(array));

		}
	}
}
