package Fuctions;

public class RemoveDuplicateWithoutInbuilt {

	public static void main(String[] args) {
		
		int[] arr = {100,90,85,70,95,90};
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count = count + 1;
					//System.out.println(arr[i]);
				}
			}
			if (count == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
