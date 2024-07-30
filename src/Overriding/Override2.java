package Overriding;
class ABCD
{
    void methodABC()
    {
        System.out.println(111);
    }
 
//    void methodABC(int i)
//    {
//        System.out.println(222);
//    }
}
 
//class XXYZ extends ABCD
//{
//    @Override
//    void methodABC(int i)
//    {
//        System.out.println(333);
//    }
// 
//    @Override
//    void methodABC()
//    {
//        System.out.println(444);
//    }
//}
 
public class Override2
{
    public static void main(String[] args)
    {
       // ABCD abc = new XXYZ();
    	ABCD abcd = new ABCD();
 
       // abcd.methodABC(10);
 
        abcd.methodABC();
    }
}