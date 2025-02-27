package testMain2;

public class AccountTransfer extends PaymentOption {
	
	public AccountTransfer (int price, String date) {
		super(price, date);
	}
	@Override
	public void processPay() {
		System.out.println("계좌이체결제 금액 : " + price + "원, 결제일 : " + date);
	}

}
