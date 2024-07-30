package Fuctions;

public class SruwapppingtwoNubers {
	public static void main(String[] args) {
        int[] a = {5, 6, 7, 1, 2};
        int[] output = transformArray(a);
        
        // Print the transformed array
        for (int num : output) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] transformArray(int[] a) {
        int n = a.length;
        int[] output = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (i > 0) {
                    output[i] = a[i - 1] + a[i];
                } else {
                    output[i] = a[i];
                }
            } else {
                output[i] = -a[i];
            }
        }
        
        return output;
    }
}