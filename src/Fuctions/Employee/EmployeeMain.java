package Fuctions.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class EmployeeMain {
	
	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<Employee>();
        
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		employeeList.forEach(System.out::println);
		System.out.println("----------------");
		
		//Categorized based on gender
		
		Map<String, Integer> gender = employeeList.stream().collect(Collectors.groupingBy(Employee:: getGender, Collectors.collectingAndThen(Collectors.counting(),Long::intValue)));
		System.out.println("Gender: "+gender);
		System.out.println("-------------------------------");
		//name of department
		
		employeeList.stream().map(n->n.getDepartment()).distinct().forEach(System.out::println);
		
		employeeList.stream().map(Employee :: getDepartment).distinct().forEach(System.out::println);
		System.out.println("----------------------------------");
		
		//average age of male and female
		
		Map<String, Double> averageAge = employeeList.stream().collect(Collectors.groupingBy(Employee :: getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(averageAge);
		
		System.out.println("------------------------------");
		//Average salary of male and female
		
		Map<String, Double> averageSalary = employeeList.stream().collect(Collectors.groupingBy(Employee:: getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("averageSalary"+averageSalary);
		
		System.out.println("-------------------------------");
		
		//Hegihest employee in organization
		Optional<Employee>  highest = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println(highest);
		
		System.out.println("------------------------------");
		
		//lowest salary
		Optional<Employee> lowest = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
		//System.out.println(lowest);
		System.out.println("---------------------------");
		//year of joining after 2015
	    employeeList.stream().filter(e->e.getYearOfJoining()> 2015).map(Employee ::getName).forEach(System.out::println);
	    System.out.println("----------------------------------");
	
		//Count empoyee in department
	    
	    Map<String, Long> department = employeeList.stream().collect(Collectors.groupingBy(Employee :: getDepartment,Collectors.counting()));
		System.out.println("department :"+department);
		
		System.out.println("-----------------------------------");
		
		//details of youngest male employee in the product development department
		
		Optional<Employee> youngdev= employeeList.stream().filter(e->e.getGender().equals("Male") && e.getDepartment().equals("Product Development")).min((e1,e2)-> e1.getAge()- e2.getAge());
	
		 System.out.println("youngdev"+youngdev);
		 System.out.println("------------------------------------");
		 
		 //Who has the most working experience in the organization
		Optional<Employee> mostExp= employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee:: getYearOfJoining)));
	    System.out.println("mostExp :"+mostExp);
	    
	    System.out.println("-----------------------------------------");
	    
	    // How many male and female employees are there in the sales and marketing team
	    Map<String, Long> sales=employeeList.stream().filter(e->e.getDepartment().equals("Sales And Marketing")).collect(Collectors.groupingBy(Employee:: getGender, Collectors.counting()));
	    System.out.println("sales :"+sales);
	    System.out.println("--------------------------------------------");
	    
	    //List down the names of all employees in each department
	    
	    Map<String, List<Employee>> allEmployeedepartmentwise = employeeList.stream().collect(Collectors.groupingBy(Employee:: getDepartment));
	     System.out.println("allEmployeedepartmentwise :"+allEmployeedepartmentwise);
	     
	     System.out.println("-------------------------------------------");
	     
	     Set<Entry<String, List<Employee>>> entryset = allEmployeedepartmentwise.entrySet();
	      System.out.println(entryset);
	      
	      for (Entry<String, List<Employee>> entry : entryset) 
	      {
	          System.out.println("--------------------------------------");
	                   
	          System.out.println("Employees In "+entry.getKey() + " : ");
	                   
	          System.out.println("--------------------------------------");
	                   
	          List<Employee> list = entry.getValue();
	                   
	          for (Employee e : list) 
	          {
	              System.out.println(e.getName());
	          }
	      }
	      
	   // 3rd lowest salaries
	      employeeList.sort(Comparator.comparingDouble(Employee::getSalary));
	      List<Employee> sortedEmployees = employeeList.subList(2, employeeList.size());
	      
	      double thirdsalry = sortedEmployees.get(0).getSalary();
	      System.out.println("third lowest salary "+thirdsalry);
	      
	}
	
	
	
	

}
