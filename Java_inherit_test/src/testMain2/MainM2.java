package testMain2;

public class MainM2 {

	public static void main(String[] args) {

		
		AccountTransfer at = new AccountTransfer(3000, "2025.02.09");
		at.processPay();
		
		CreditCard cred = new CreditCard(55000, "2025.02.16");
		cred.processPay();
		
		CheckCard check = new CheckCard(45000, "2025.02.10");
		check.processPay();
		
		Cash cash = new Cash(5000, "2025.01.30");
		cash.processPay();

	}

}
