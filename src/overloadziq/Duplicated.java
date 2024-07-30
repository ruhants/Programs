package overloadziq;

public class Duplicated {
	void method1(int ... a)
    {
        System.out.println(1);
    }
 
    void method(int[] a)
    {
        System.out.println(2);
    }
    
    public static void main(String[] args) {
		Duplicated duplicated = new Duplicated();
		duplicated.method1();
	}

}
