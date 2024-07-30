package StringArraysProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Rotate {
	public static void main(String[] args) {

		Integer[] array = { 1, 2, 3, 4, 5, 6, 7 };
		int sreps = 3;

		Integer[] rotatedArray = rotated(array, sreps);

		System.out.println(Arrays.toString(rotatedArray));
	}

	public static Integer[] rotated(Integer[] array, int steps) {
		int length = array.length;
		//steps = steps % length;
		List<Integer> list = Arrays.stream(array).collect(Collectors.toList());
		Collections.rotate(list, steps);

		return list.toArray(new Integer[0]);

	}
}
