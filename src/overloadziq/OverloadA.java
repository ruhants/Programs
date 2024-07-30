package overloadziq;

class A

{
 
}
 
class B extends OverloadA
{
 
}
 
class C extends B
{
 
}
 
public class OverloadA
{
    static void overloadedMethod(OverloadA a)
    {
        System.out.println("ONE");
    }
 
//    static void overloadedMethod(B b)
//    {
//        System.out.println("TWO");
//    }
// 
    static void overloadedMethod(Object obj)
    {
        System.out.println("THREE");
    }
 
    public static void main(String[] args)
    {
        C c = new C();
 
        overloadedMethod(c);
        overloadedMethod(null);
        //overloadedMethod();
    }
}