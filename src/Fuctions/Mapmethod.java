package Fuctions;

import java.util.Arrays;
import java.util.List;

public class Mapmethod {
	private String empName;
	   private String empDesignation;
	   public Mapmethod(String empName) {
	      this.empName = empName;
	   }
	   public String getEmployeeName() {
	      return empName;
	   }
	   public void setEmployeeName(String empName) {
	      this.empName = empName;
	   }
	   public String getEmployeeDesignation() {
	      return empDesignation;
	   }
	   public void setEmployeeDesignation(String empDesignation) {
	      this.empDesignation = empDesignation;
	   }
public static void main(String[] args) {
	List<Mapmethod> list = Arrays.asList( new Mapmethod("Jai"),
	         new Mapmethod("Adithya"),
	         new Mapmethod("Raja"));
	
	list.stream().map(l->l.getEmployeeDesignation()).forEach(System.out::println);

}
}
