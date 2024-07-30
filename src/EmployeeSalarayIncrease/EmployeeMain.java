package EmployeeSalarayIncrease;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		Employee abc = new Employee("abc", 23, 100);
		Employee zbc = new Employee("zbc", 22, 200);
		Employee lbc = new Employee("lbc", 24, 300);
		Employee ebc = new Employee("ebc", 26, 400);
		Employee pbc = new Employee("pbc", 25, 500);

		list.add(abc);

		list.add(zbc);

		list.add(lbc);

		list.add(ebc);

		list.add(pbc);

		list.stream().map(e -> {
			if (e.getAge() >= 25) {
				e.setSalary((int) (e.getSalary() * 1.50));
			}
			return e;
		}).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("-----------------------");
		list.stream().filter(a -> a.getAge() > 24).forEach(System.out::println);

	}

}
