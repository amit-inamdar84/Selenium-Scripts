package encapsulation;

public class D {
	
	public static void main(String[] args) {
		//Setting data using object obj.
		C obj = new C();
		obj.setLoanNo(606814365);
		obj.setAmount(664038.50f);
		
		//Getting data using another object obj1. This will return 0 as there is no data sharing between objects.
		C obj1 = new C();
		System.out.println(obj1.getLoanNo());
		System.out.println(obj1.getAmount());
	}

}
