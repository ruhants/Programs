package StringArraysProgram;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = {1,2,4,5,6};
		int n = arr.length+1;
		int ecpectedSum = n*(n+1)/2;
		
		int acutal =  Arrays.stream(arr).sum();
		
		int result = ecpectedSum- acutal;
		System.out.println(result);
		
	}

}
