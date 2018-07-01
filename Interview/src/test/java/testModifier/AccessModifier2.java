package testModifier;

import com.amit.web.corejava.AccessModifiers;

public class AccessModifier2 {

	public static void main(String[] args) {
		//To create object of class outside the package we need to import
		AccessModifiers obj = new AccessModifiers();
		System.out.println(obj.p); //Can access only public variable outside class without inheritance
		obj.test4();//Can access only public method outside class without inheritance

	}

}
