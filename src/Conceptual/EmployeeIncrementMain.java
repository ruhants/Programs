package Conceptual;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class EmployeeIncrementMain {

	  public static void main(String[] args) {
	        ArrayList<EmployeeIncrement> employees = new ArrayList<>();

	        // Add sample employees with their salaries
	        employees.add(new EmployeeIncrement(1,"John", 50000.0,27));
	        employees.add(new EmployeeIncrement(2,"Alice", 60000.0,25));
	        employees.add(new EmployeeIncrement(3,"Bob", 70000,28));
	        employees.add(new EmployeeIncrement(4,"rob", 7000000,28));
	        employees.add(new EmployeeIncrement(5,"mob", 7500000,28));
	        
	        
	        
	        List<EmployeeIncrement> employeeOlder32 = employees.stream()
	        	    .filter(i -> i.getSalary() >= 100000)
	        	    .collect(Collectors.toList()); 
	        	employeeOlder32.forEach(employee -> 
	        	    employee.setSalary(Math.round(employee.getSalary() * 1.2))
	        	);
	        
	        
	        System.out.println(employeeOlder32);
	        
	       

	  }
	}
	
