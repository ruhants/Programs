package Fuctions;

public class ReoveBraces {

	public static String minRemoveToMakeValid(String str) {
	    int n = str.length();
	    StringBuilder sb = new StringBuilder(n);
	    boolean[] remove = new boolean[n];
	    
	    
	    int open = 0;
	    for (int i = 0; i < n; i++) {
	        if (str.charAt(i) == '(') {
	            open++;
	        } else if (str.charAt(i) == ')') {
	            if (open > 0) {
	                open--;
	            } else {
	                remove[i] = true;
	            }
	        }
	    }

	    int close = 0;
	    for (int i = n - 1; i >= 0; i--) {
	        if (str.charAt(i) == ')') {
	            close++;
	        } else if (str.charAt(i) == '(') {
	            if (close > 0) {
	                close--;
	            } else {
	                remove[i] = true;
	            }
	        }
	    }

	    for (int i = 0; i < n; i++) {
	        if (!remove[i]) 
	        	sb.append(str.charAt(i));
	    }

	    return sb.toString();
	}

    public static void main(String[] args) {
        String string = "(r(o)ha)n)(";
        String fixedString = minRemoveToMakeValid(string);
        System.out.println(fixedString);  
    }
}
