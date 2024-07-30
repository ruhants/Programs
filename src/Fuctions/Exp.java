package Fuctions;

public class Exp {

	 public static String d(String[] fnf) {
	        StringBuilder result = new StringBuilder();
	        
	        for (String arg : fnf) {
	            result.append("hei");
	        }
	        
	        return result.toString();
	    }
	 
	 static class Main {
		 public static void main(String[] args) {
			 String result = Exp.d(args);
		        System.out.println(result);
		}
	 }

}
