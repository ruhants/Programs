package Fuctions;

public class DuplicateWithoutInbuitFunction {

	
	public static void main(String[] args) {
		String str = "hi hello";
		
		char ch[] = str.toCharArray();
		
		for(int i=0; i<ch.length;i++) {
			for(int j=i+1; j<ch.length-1; j++) {
				if(ch[i]!=ch[j]) {
				System.out.println(ch[j]);
				break;
			}
		}
	}
}
}
