package overloadziq;



	class Xx
	{
	    void calculate(int a, int b)
	    {
	        System.out.println("Class X");
	    }
	}
	 
	class Yy extends Xx
	{
	    @Override
	    void calculate(int a, int b)
	    {
	        System.out.println("Class Y");
	    }
	}
	 
	class Z extends Yy
	{
	    @Override
	    void calculate(int a, int b)
	    {
	        System.out.println("Class Z");
	    }
	}
	 
	public class ClassCastException
	{
	    public static void main(String[] args)
	    {
	        Xx x = new Yy();
	 
	        x.calculate(10, 20);
	 
	        Yy y = (Yy) x;
	 
	        y.calculate(50, 100);
	 
	        Z z = (Z) y;
	 
	        z.calculate(100, 200);
	    }
	}

