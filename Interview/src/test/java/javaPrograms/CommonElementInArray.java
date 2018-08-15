package javaPrograms;

public class CommonElementInArray {
	public static void main(String[] args) {
		int[] arr1 = {5,9,8,7,1};
		int[] arr2 = {2,9,1,8,0,10,7};
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					System.out.println(arr1[i]+ "---" +arr2[j]);
					//continue;
				}
			}
		}
	}

}
