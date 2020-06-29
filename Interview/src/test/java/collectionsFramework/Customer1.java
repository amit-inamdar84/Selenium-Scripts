package collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//Using comparator interface
//Contains 2 umimplemented methods - compare() and equals().
//Can sort all data type using the method compare()
//sort() method is a static method of Collections class. It has 2 sort methods which accepts only list and another which accepts list and comparator
//object as parameters.
//

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
		arr1.add(new Customer1("D", 25, "Jax"));
		arr1.add(new Customer1("Z", 19, "Bang"));
		arr1.add(new Customer1("A", 22, "Gdg"));
		
        System.out.println("Sorting by Name:");
		Collections.sort(arr1, new NameComparator());

		Iterator itr = arr1.iterator();
		while (itr.hasNext()) {
			Customer1 c = (Customer1) itr.next();
			System.out.println(c.name + " " + c.age + " " + c.area);
		}
		
		System.out.println("Sorting by Age:");
		Collections.sort(arr1, new AgeComparator());
		Iterator itr1 = arr1.iterator();
		while (itr1.hasNext()) {
			Customer1 c = (Customer1) itr1.next();
			System.out.println(c.name + " " + c.age + " " + c.area);
		}
		
		System.out.println("Sorting by Area:");
		Collections.sort(arr1, new AreaComparator());

		Iterator itr2 = arr1.iterator();
		while (itr2.hasNext()) {
			Customer1 c = (Customer1) itr2.next();
			System.out.println(c.name + " " + c.age + " " + c.area);
		}

	}

}
