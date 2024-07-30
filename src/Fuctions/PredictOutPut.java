package Fuctions;

class Parent {
	void show(String s) {
		System.out.println("Parent's show()");
	}
}

class Child extends Parent {

	void show(Object o) {
		System.out.println("Child's show()");
	}
}

public class PredictOutPut {
	public static void main(String[] args) {

		Parent parent = new Child();
		
		//Child child = (Child) new Parent();
		//child.show(child);
		parent.show(null);
		// C c = new C();
	}
}
