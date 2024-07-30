package Exception;

public class Exception4 {

//	static void anyMethod() {
//		
//		try {
//			System.out.println("Try Block");
//		} catch (Exception e) {
//			System.out.println("Catch Block");
//		} finally {
//			return;
//		}
//
//		System.out.println("Any Statements");
//	}
//
//	public static void main(String[] args) {
//		anyMethod();
//	}
	
	public static void someMethod() {
	    try {
	        System.out.println("In try block");
	    } catch (Exception e) {
	        System.out.println("In catch block");
	    } finally {
	        System.out.println("In finally block");
	    }

	    // This code is outside the try-catch-finally construct and will execute after it
	    System.out.println("After finally block");
	}
	public static void main(String[] args) {
		Exception4 exception4 = new Exception4();
		exception4.someMethod();
		
	}

}
