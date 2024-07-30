package overloadziq;

class Aa
{
	public Aa(int i) {
		System.out.println(1);
	}

	public Aa() {
		this(10);

		System.out.println(2);
	}

	void A() {
		A(10);

		System.out.println(3);
	}

	void A(int i) {
		System.out.println(4);
	}
	
}

public class OrderOfOutPut
{
    public static void main(String[] args)
    {
        new Aa().A();
    }
}
