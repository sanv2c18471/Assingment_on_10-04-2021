package demo22;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Student{
	int id;
	String name;
	float marks;
	public Student(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}
public class Example2functionalinterface {
public static void main(String[] args) {
	ArrayList <Student> arrayList = new ArrayList <Student> ();
	arrayList.add(new Student(101,"Guna",98f));
	arrayList.add(new Student(105,"Aravind",80f));
	arrayList.add(new Student(101,"Jai",99f));
	arrayList.add(new Student(107,"Mani",23f));
	arrayList.add(new Student(106,"Kalai",56f));
	arrayList.add(new Student(108,"Thanapal",67f));
	arrayList.add(new Student(103,"Lokesh",75f));
	arrayList.add(new Student(104,"Harish",45f));
	arrayList.add(new Student(102,"Boopathi",35f));
	arrayList.add(new Student(110,"Chandru",71f));
	arrayList.add(new Student(109,"David",19f));
	Predicate<Student> pre1 = m->m.marks>80;
	Predicate<Student> pre2 = (m)->(m.marks<=80) && (m.marks>60);
	Predicate<Student> pre3 = (m)->(m.marks<=60) && (m.marks>50);
	Predicate<Student> pre4 = (m)->(m.marks<=50) && (m.marks>35);
	Predicate<Student> pre5 = m->m.marks<35;
	//Consumer<Student> cons1 = name -> System.out.println(name);
	for(Student s : arrayList) {
		if(pre1.test(s)) {
		System.out.println("Marks Above 80: "+s.marks+" "+s.name);	
		System.out.println("Distinction");
		//cons1.accept(s);
    	System.out.println(" ");
		} else if(pre2.test(s)) {
    			System.out.println("Marks between 80 to 60: "+s.marks);	
    			System.out.println("First Class");
    			System.out.println(" ");
    		}else if(pre3.test(s)) {
    			System.out.println("Marks between 60 to 50: "+s.marks);	
    			System.out.println("Second Class");
    			System.out.println(" ");
    		}else if(pre4.test(s)) {
    			System.out.println("Marks between 50 to 35: "+s.marks);	
    			System.out.println("Third Class");
    			System.out.println(" ");
    		}else if(pre5.test(s)) {
    			System.out.println("Marks below 35: "+s.marks);	
    			System.out.println("Fail");
    			System.out.println(" ");
    		}
    	//Function<Float, String> fun = a1->a1.compareTo(a2);
    	//System.out.println(fun.apply(56f);
    	
    			
	}
	}
	//Supplier<Student> sup1 = ()->name;
	//System.out.println(sup1.get());
}
