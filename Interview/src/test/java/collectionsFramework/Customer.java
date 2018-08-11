package collectionsFramework;
//Using comparable interface

import java.util.ArrayList;
import java.util.Collections;

//Only compareTo method available
//Can sort based on only single data type

public class Customer implements Comparable<Customer> {
	String name;
	int age;
	String area;

	public Customer(String name, int age, String area) {
		super();
		this.name = name;
		this.age = age;
		this.area = area;
	}

	@Override
	public int compareTo(Customer c) {
		//return this.age - c.age;
		if (age == c.age) {
			return 0;
		}

		else if (age > c.age) {
			return 1;
		}

		else {
			return -1;
		}
	}

/*	@Override
	public String toString() {
		return "[ name=" + name + ", age=" + age + ", area=" + area + "]";
	}*/

	public static void main(String[] args) {
		ArrayList<Customer> arr1 = new ArrayList<Customer>();
		arr1.add(new Customer("A", 20, "Jax"));
		arr1.add(new Customer("B", 19, "Bang"));

		Collections.sort(arr1);

		for (Customer str : arr1) {
			System.out.println(str.name+ " "+ str.age+ " "+str.area);
		}

	}

}
