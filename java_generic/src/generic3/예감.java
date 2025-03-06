package generic3;

public class 예감 extends Snack {
	
	public 예감 (String snackName, int price) {
		super(snackName, price);
	}
	
	@Override
	public String toString () {
		return snackName + " 한 박스 가격  : " + price;
	}

}
