package Fuctions;

public class AlternateCapital {
	public static void main(String[] args) {

		String str = "abcdf";
	      str = str.toLowerCase();
	      char[] ch = str.toCharArray();
	      for(int i=0; i<ch.length; i=i+2){
	         ch[i] = Character.toUpperCase(ch[i]);
	      }
	      System.out.println(ch);
	   }
	
	

}
