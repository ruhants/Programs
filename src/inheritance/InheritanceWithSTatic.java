package inheritance;

class X
{
     void staticMethod()
    {
        System.out.println("Class X");
    }
}
 
class Y extends X
{
     void staticMethod()
    {
        System.out.println("Class Y");
    }
}
 
public class InheritanceWithSTatic
{
    public static void main(String[] args)
    {
        //Y.staticMethod();
        X y = new Y();
        y.staticMethod();
    }}
