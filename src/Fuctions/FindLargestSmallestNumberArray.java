package Fuctions;

public class FindLargestSmallestNumberArray {
	
	public static void main(String[] args) {
		 int[] numbers = {23,43,53,54,32,65,63,98,43,99};
		 
		 int smallest =  numbers[0];
		 int largest = numbers[0];
		 
		 for(int i =1;i<numbers.length; i++) {
			 if(numbers[i]>largest)
				 largest = numbers[i];
			 else if(numbers[i]<smallest) 
				 smallest = numbers[i];
				 
			}
		 System.out.println("largest :"+largest);
		 System.out.println("smallest :"+smallest);
		}
}