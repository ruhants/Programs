package Fuctions;

public class RevrseWithoutInbuilt {
	
	public static void main(String[] args) {
		
		String str= "Indian iam";
		
		char Character[]=str.toCharArray();
		
		for (int i=Character.length-1; i>=0;i--) {
			System.out.print(Character[i]);
			
			
//			StringBuilder stringBuilder = new StringBuilder(str);
//			stringBuilder.reverse();
//			System.out.println(stringBuilder);
			
			
		}
	}

}
