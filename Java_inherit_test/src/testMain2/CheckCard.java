package testMain2;

public class CheckCard extends PaymentOption {
	public CheckCard  (int price, String date) {
		super(price, date);
	}
	@Override
	public void processPay() {
		System.out.println("체크카드결제 금액 : " + price + "원, 결제일 : " + date);
	}
}
