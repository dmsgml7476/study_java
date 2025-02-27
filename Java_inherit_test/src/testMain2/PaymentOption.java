package testMain2;

public abstract class PaymentOption {
	
	protected int price;
	protected String date;
	
	public PaymentOption() {};
	public PaymentOption(int price, String date) {
		this.price=price;
		this.date=date;
	}
	
	public abstract void processPay();
	

}
