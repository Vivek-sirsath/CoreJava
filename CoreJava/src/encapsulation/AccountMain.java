package encapsulation;

public class AccountMain {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAccNo(5492642);
		System.out.println("Account Number is: " + acc.getAccNo());
		
		acc.setAccHolderName("Peter");
		System.out.println("Account Holder name is: " + acc.getAccHolderName());
		
		acc.setAmount(235592.25);
		System.out.println("Account Balance is: " + acc.getAmount());
	}

}
