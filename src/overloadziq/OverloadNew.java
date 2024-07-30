package overloadziq;

class Parent {
	public void methodOne(int... i) {
		System.out.println("parent class");
	}
}

class Child extends Parent { // overloading but not overriding.
	public void methodOne(int i) {
		System.out.println("child class");
	}
}

class OverloadNew {
	public static void main(String[] args) {
		Parent p=new Parent(); 
	p.methodOne(10); 
	Child c=new Child(); 
	c.methodOne(10);
	Parent p1=new Child();
	p1.methodOne(10);
	}
}
