package Fuctions;

import java.util.Arrays;
public class MoveZerosToEnd {
	public static void main(String[] args) {
		int[] myArray = { 1, 0, 9, 0, 4, 5, 0 };
		int pos = 0;
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] != 0) {
				myArray[pos] = myArray[i];
				pos++;
				Arrays.sort(myArray);
				System.out.println(myArray[i]);
			}
		}
		while (pos < myArray.length) {
			myArray[pos] = 0;
			pos++;
					}
		System.out.println("The array created is: " + Arrays.toString(myArray));
	}
	}