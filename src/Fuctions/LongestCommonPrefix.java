package Fuctions;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String str[]= {"flower", "flow", "flight"};
		
		String result = longestCommonPrefix(str);
		System.out.println(result);
	}
 
	public static String longestCommonPrefix(String[] arr) {
		if(arr.length==0)
			return "";
		String op =arr[0];
		for(int i=1; i<arr.length;i++)
			while (arr[i].indexOf(op) != 0)
                op = op.substring(0, op.length() - 1);
		
		return op;
		
	}
}
