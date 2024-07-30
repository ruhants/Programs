package Fuctions;


import java.util.Arrays;

public class Incriment {
//	public static void main(String[] args) {
//		int input1[]= {1,2,3};
//		int output1[] =incri(input1);
//		System.out.println(Arrays.toString(output1));
//	}
//	
//	public static int[]  incri(int[] input) {
//		int result[] = Arrays.copyOf(input,input.length+1);
//		result[result.length-1]= input[input.length-1]+1;
//	
//		return result;
//		
//		
//		
//		
//	}
	
	public static int []addnumber(int[] input) {
		int result[] = Arrays.copyOf(input, input.length+1);
		result[result.length-1] = input[input.length-1]+1;
		return result;
		
	}

}
