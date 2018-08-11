package collectionsFramework;
//Using comparator interface

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//Can sort all data type using the method compare()

public class Customer1 {
	String name;
	int age;
	String area;

	public Customer1(String name, int age, String area) {
		super();
		this.name = name;
		this.age = age;
		this.area = area;
	}
	
	public static void main(String[] args) {
		ArrayList<Customer1> arr1 = new ArrayList<Customer1>();
		arr1.add(new Customer1("D",25,"Jax"));
		arr1.add(new Customer1("Z",19,"Bang"));
		arr1.add(new Customer1("A",22,"Gdg"));
		
		Collections.sort(arr1, new NameComparator());
		
		Iterator itr = arr1.iterator();
		while (itr.hasNext()) {
			Customer1 c = (Customer1) itr.next();
			System.out.println(c.name+ " " +c.age+ " "+ c.area);
		}
		
		Collections.sort(arr1, new AgeComparator());
		Iterator itr1 = arr1.iterator();
		while (itr1.hasNext()) {
			Customer1 c = (Customer1) itr1.next();
			System.out.println(c.name+ " " +c.age+ " "+ c.area);
		}
		
		
	}

}
