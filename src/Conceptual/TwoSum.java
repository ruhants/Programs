package Conceptual;

public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
			if(	nums[j]==target-nums[i]) {
				return new int[] {i,j};
			}
				
			}
		}
		
		
		return null;
		
	}
	
	public static void main(String[] args) {
		int[] nums= {3,2,5};
		int target = 6;
		int[] output = twoSum(nums, target);
		System.out.println(output[0]+" "+output[1]);
		
	}
}
