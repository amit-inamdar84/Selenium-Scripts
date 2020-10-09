package collectionsFramework;
//Using comparable interface we can sort string, wrapper class and user defined objects.

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
//A comparable object is capable of comparing itself with another object.
//Only compareTo method available.
//Can sort based on only single data type. i.e. if object has 3 data members we can sort based on only one type.
//compareTo method cannot sort Strings or other kind of data as String comparison conditions in method do not apply to strings.
//Mainly used to sort lists. Sets can be sorted using Tree set.
//Primitive data types can be sorted directly using Collection.sort method. However for custom data type like class type we need to implement
//Comparable interface which has only compareTo() method.

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
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Vedha");
		ll.add("Ramesh");
		ll.add("Rama");
		ll.add("Amit");
		
		Collections.sort(ll);
		
		for(String temp:ll){
			System.out.println(temp);
		}

	}

}
