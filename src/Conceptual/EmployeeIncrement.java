package Conceptual;

import java.util.Objects;

public class EmployeeIncrement {
	
	    private int id;
	    private String name;
	    private double salary;
	    private int age;
	    
	    

	    
	    public int getId() {
			return id;
		}




		public void setId(int id) {
			this.id = id;
		}




		public String getName() {
			return name;
		}




		public void setName(String name) {
			this.name = name;
		}




		public double getSalary() {
			return salary;
		}




		public void setSalary(double salary) {
			this.salary = salary;
		}




		public int getAge() {
			return age;
		}




		public void setAge(int age) {
			this.age = age;
		}




		public EmployeeIncrement(int id, String name, double salary, int age) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.age = age;
		}




		@Override
		public String toString() {
			return "EmployeeIncrement [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
		}




		public EmployeeIncrement() {
			super();
			// TODO Auto-generated constructor stub
		}




		@Override
		public int hashCode() {
			return Objects.hash(age, id, name, salary);
		}




		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			EmployeeIncrement other = (EmployeeIncrement) obj;
			return age == other.age && id == other.id && Objects.equals(name, other.name)
					&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
		}



//
//		public void raiseSalary(double percentage) {
//	        salary = salary * (1+percentage / 100);
	    }
	
