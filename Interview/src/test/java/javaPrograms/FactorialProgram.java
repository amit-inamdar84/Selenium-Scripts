package javaPrograms;

public class FactorialProgram {
	int n = 5;

	//Recursive function
	public int factorial(int n) {
		if(n<=1){
			return 1;
		}
		else{
			return n*factorial(n-1);
		}
		
	}
	
	//Non-recursive or iterative function
	public int fact(int n){
		int result = 1;
		if(n<=1){
			return 1;
		}
		
		for(int i=n;i>=1;n--){
			result = result * n;
		}
		return result;
	}
	
	//Another non-recursive or iterative function
	public int whileFact(int num){
		int result = 1;
		while(num!=0){
			result = result * num;
			num--;
		}
		return result;
	}

	public static void main(String[] args) {
		FactorialProgram obj = new FactorialProgram();
		//System.out.println(obj.factorial(obj.n));
		//int result = obj.fact(5);
		int result = obj.whileFact(5);
		System.out.println(result);
	}


}
