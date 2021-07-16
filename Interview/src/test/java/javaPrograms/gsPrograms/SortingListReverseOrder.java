package javaPrograms.gsPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingListReverseOrder {
	
	public static ArrayList<String> sortDesc(ArrayList<String> arrList){
		//Using java library
		/*Collections.sort(arrList, Collections.reverseOrder());
		
		for(String s : arrList){
			System.out.println("Reverse order: "+s);
		}*/
		
		//Without java library
		ArrayList<String> revList = new ArrayList<String>(arrList.size());
		for(int i = arrList.size()-1;i>=0; i-- ){
			revList.add(arrList.get(i));
		}
		
		return revList;
	}
	
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Amit");
		arrList.add("TCE");
		arrList.add("Xorail");
		arrList.add("Cognizant");
		
		List result = SortingListReverseOrder.sortDesc(arrList);
		System.out.println(result);
		
	}

}
