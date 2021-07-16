package javaPrograms.gsPrograms;

public class FindDuplicatesInArray {
	
   public static void duplicate(int arr[]){
	   for(int i=0; i<arr.length;i++){
		   for(int j=i+1;j<arr.length;j++){
			   if(arr[i]==arr[j]){
				   System.out.println(arr[j]);
			   }
		   }
	   }
   }
	
   public static void main(String[] args) {
	int arr[] = {10,90,10,5,80,90};
	FindDuplicatesInArray.duplicate(arr);
}
}
