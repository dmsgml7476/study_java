package testMain2;

public class Cash extends PaymentOption {
	public Cash  (int price, String date) {
		super(price, date);
	}
	
	@Override
	public void processPay() {
		System.out.println("현금결제 금액 : " + price + "원, 결제일 : " + date);
	}
}
