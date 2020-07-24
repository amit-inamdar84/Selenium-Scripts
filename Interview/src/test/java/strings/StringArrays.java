package strings;

import java.util.Map;
import java.util.TreeMap;

public class StringArrays {
	public static void main(String[] args) {
		String str[] = new String[2];
		str[0] = "AAX";
		str[1] = "ddf";
		
		Map<Integer, String[]> data = new TreeMap<Integer, String[]>();
		data.put(1, new String[]{"ACC","jkkj"});
		System.out.println(data);
		
		
		//Map<Integer, int[]> data1 = new TreeMap<Integer, int[]>();
		//data.put(1, new int[]{1,2});
	}

}
