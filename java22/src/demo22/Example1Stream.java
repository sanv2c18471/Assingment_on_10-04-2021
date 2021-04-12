package demo22;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee {
	int id;
	String Name;
	int age;

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		Name = name;
		this.age = age;
	}
}

public class Example1Stream {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "Geetha", 56));
		list.add(new Employee(105, "Pradeep", 59));
		list.add(new Employee(103, "Lakshmi", 40));
		list.add(new Employee(106, "Monika", 50));
		list.add(new Employee(102, "Kavin", 86));
		list.add(new Employee(104, "Monika", 46));
		list.add(new Employee(107, "Varun", 54));
		List<Integer> ageList = list.stream()
				.filter(a -> a.age > 50)
				.map(a -> a.age)
				.collect(Collectors.toList());
		System.out.println("Employee above 50 Yrs: " + ageList);
		Employee emp1 = list.stream()
				.max((a, b) -> a.age > b.age ? 1 : -1).get();
		System.out.println("Max age of Employee is: " + emp1.age);
		Employee emp2 = list.stream().min((a, b) -> a.age > b.age ? 1 : -1).get();
		System.out.println("Min ageof Employee is: " + emp2.age);
		Set<String> nameList = list.stream() 
				.filter(a->a.Name.equals(a.Name))
				//.filter(a->a.Name==a.Name)
				.map(a->a.Name)
				.collect(Collectors.toSet());
		System.out.println("Name List: "+nameList);
	}
}
