package ScoreCounting;

public abstract class CheckAbstract {
	public abstract void test();

}
 abstract class A extends CheckAbstract{
	
	public abstract void test();
	
	
}
 class B extends A{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("test");
	}
	 
 }