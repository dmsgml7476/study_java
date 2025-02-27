package testMain2;

public class CreditCard extends PaymentOption {
	public CreditCard  (int price, String date) {
		super(price, date);
	}
	@Override
	public void processPay() {
		System.out.println("신용카드결제 금액 : " + price + "원, 결제일 : " + date);
	}

}
