package Fuctions;

public class Addwithoutsign {
	public static void main(String[] args) {
		System.out.println(Addwithoutsign.Add(100, 1000));
	}
	static int  Add(int a, int b){  
	        while (b != 0){
            int carry = (a & b) ; 
            System.out.println(carry);
            a =(a^b);
            System.out.println(a);
	        b = carry<< 1;
	        System.out.println(b);
	        }
			return a;    
	 }
	
	
	}
