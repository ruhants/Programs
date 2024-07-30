package Conceptual;
import java.util.HashSet;
import java.util.Set;




	public class UncommonUppercaseASCII {

	    public static char[] findUniqueAlphabets(char[] arr1, char[] arr2) {
	        Set<Character> uniqueSet = new HashSet<>();
	        
	        // Add all characters from the first array to the set
	        for (char ch : arr1) {
	            uniqueSet.add(ch);
	        }
	        
	        // Add all characters from the second array to the set
	        for (char ch : arr2) {
	            uniqueSet.add(ch);
	        }

	        // Convert the set back to a char array
	        char[] uniqueArray = new char[uniqueSet.size()];
	        int index = 0;
	        for (char ch : uniqueSet) {
	            uniqueArray[index++] = ch;
	        }

	        return uniqueArray;
	    }

	    public static void main(String[] args) {
	        char[] array1 = {'A', 'B', 'C', 'D'};
	        char[] array2 = {'C', 'D', 'E', 'F'};

	        char[] uniqueAlphabets = findUniqueAlphabets(array1, array2);
             System.out.println(uniqueAlphabets);
             int sum = 0;

             for (char ch : uniqueAlphabets) {
                 // Add the ASCII value of the character to the sum
                 sum += (int) ch;
             }

             System.out.println(sum);
	        System.out.print("Unique Alphabets: ");
	        for (char ch : uniqueAlphabets) {
	            System.out.print(ch + " ");
	        }
	        
	    }
	}



    
    


