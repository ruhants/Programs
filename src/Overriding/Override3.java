package Overriding;




 class Tests{
	 void methodWithNodatatype() {
		 System.out.println(888);
	 }
 }
 
 class TestA extends Tests{
	 void methodWithNodatatype() {
		 System.out.println("heheheh");
	 }
 }
public class Override3 {
	public static void main(String[] args) {
		TestA testA = new  TestA();
		testA.methodWithNodatatype();
	}
	

}
