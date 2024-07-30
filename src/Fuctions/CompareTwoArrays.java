package Fuctions;

import java.util.Arrays;

public class CompareTwoArrays {
	
	public static void main(String[] args) {
		
	
	int arr[]= {1,4,2,3,5,6,7};
	int arrnew[]= {2,1,4,3,6};
	
	if(checkTwoArrays(arr, arrnew)) {
		System.out.println("present");
	}else {
	System.out.println("not present");
	}
	}


public static  boolean checkTwoArrays(int[] arr,int[] arrnew) {
	int n= arr.length;
	int m=arrnew.length;
	
	if(n!= m) {
		return false;
		
	}
	Arrays.sort(arr);
	Arrays.sort(arrnew);
	
	for(int i=0;i<n;i++) {
		if(arr[i]!=arrnew[i]) {
			return false;
		}
	}
	
	return true;
	
}
}
