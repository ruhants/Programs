package Fuctions;

import java.util.Arrays;

public class MoveAllPositiveNegativeEelemntAside {
	
	public static void main(String[] args) {
		int arr[] = {2,4,6,-6,9,10,-4,7,-3};
		int temp = 0;
		for(int i = 0;i<arr.length; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp =arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
				
				
	}

}
