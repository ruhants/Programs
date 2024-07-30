package Fuctions;

public class SecondHighestNumber {
	
	public static void main(String args[]){
	      int temp;
	      int array[] = {100,400,399,5000,200,3999};

	      for(int i = 0; i<array.length; i++ ){
	         for(int j = i+1; j<array.length; j++){

	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      
	     // System.out.println(array[array.length]);
	      System.out.println("second largest number is:: "+array[array.length-2]);
	      
	      for(int i=0;i<array.length;i++) {
	    	  System.out.println(array[i]);
	      }
	   }
	}
	


