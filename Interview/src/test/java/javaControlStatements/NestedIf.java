package javaControlStatements;
//If inside if block
//We can also use if else inside if block
//We can also use if and if else inside if block

public class NestedIf {
	public static void main(String[] args) {
		int i = 10;
		if(i == 10){
			System.out.println("i is 10");
			
			if(i>9){
				System.out.println("i is greater than 9");
			}
		}
		System.out.println("----------------------");
		
		int k = 50;
		if(k == 50){
			System.out.println("Entered inside first if");
			if(k>49){
				System.out.println("Entered inside second if");
			}
			
			if(k==10){
				System.out.println("Entered inside third if");
			}
			else{
				System.out.println("Skipping third if and executing else");
			}
		}
		
	}

}
