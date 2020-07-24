package encapsulation;

public class D {
	
	public static void main(String[] args) {
		C obj = new C();
		obj.setLoanNo(606814365);
		obj.setAmount(664038.50f);
		
		C obj1 = new C();
		System.out.println(obj1.getLoanNo());
		System.out.println(obj1.getAmount());
	}

}
