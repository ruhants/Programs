package Fuctions;

public class PeakElement {
	public static void main(String[] args) {
		
		int[] nums= {1, 3, 4, 1,100, 0};
		
		int peakindex = peakelement(nums);
		if(peakindex!=-1) {
			System.out.println(nums[peakindex]);
		}else {
			System.out.println("not present");
		}
		
	}

	public static int peakelement(int[] nums) {
		int n = nums.length;
		if(n == 1) {
			return 0;
		}
		//check for first elemnt 
		if(nums[0]>= nums[1]) {
			return 0;
		}
		//check for last elemnt 
		if(nums[n-1]>=nums[n-2]) {
			return 0;
			
		}
		
		for(int i =1;i<=n-1;i++) {
			if(nums[i]>=nums[i-1] && nums[i]>=nums[i+1]) {
				return i;
			}
		}
		
		
		return -1;
		
	}
}
