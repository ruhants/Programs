package Fuctions;

import java.util.Arrays;
import java.util.Scanner;

public class SumToGivenNumber {
	
	public static void main(String args[]){
	      //Reading the array from the user
//	      Scanner sc = new Scanner(System.in);
//	      System.out.println("Enter the size of the array that is to be created: ");
//	      int size = sc.nextInt();
//	      int[] myArray = new int[size];
//	      System.out.println("Enter the elements of the array: ");
//	      for(int i=0; i<size; i++){
//	         myArray[i] = sc.nextInt();
//	      }
//	      //Reading the number
//	      System.out.println("Enter the number: ");
//	      int num = sc.nextInt();
		
		int [] myArray = {10, -5, 20, 11, 25, 10, 12, 8};
		int num = 20;
	      System.out.println("The array created is: "+Arrays.toString(myArray));
	      System.out.println(" elements whose sum is: "+num);
	      for(int i=0; i<myArray.length; i++){
	         for (int j=i; j<myArray.length; j++){
	            if((myArray[i]+myArray[j])== num && i!=j){
	               System.out.println(myArray[i]+", "+myArray[j]);
	            }
	         }
	      }
	   }
}
