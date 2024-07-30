package Fuctions;

import java.util.Arrays;

public class ArrayRemoveDuplicate {
	public static void removeDuplicates(int[] arg) {
		Arrays.sort(arg);
		for (int i = 0; i+1 < arg.length; i++) {
			if (arg[i] != arg[i + 1]) {
				System.out.println(arg[i]);
			}
		}
	}
	public static void main(String[] args) {
		int arg[] = { 20, 30, 30};
		ArrayRemoveDuplicate.removeDuplicates(arg);
	}
}
