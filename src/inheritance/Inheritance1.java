package inheritance;

class A
{
    String s = "Class A";{
    	 System.out.println(s);
    }
}
 
class B extends A
{
    String s = "Class B";
 
    {
        System.out.println(s);
    }
}
 
class C extends B
{
    String s = "Class C";
 
    {
        System.out.println(s);
    }
}
 
public class Inheritance1
{
    public static void main(String[] args)
    {
        C c = new C();
 
        System.out.println(c.s);
    }
}
