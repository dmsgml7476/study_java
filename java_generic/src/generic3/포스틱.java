package generic3;

public class 포스틱 extends Snack {
	
	public 포스틱 (String snackName, int price) {
		super(snackName, price);
	}
	
	@Override
	public String toString () {
		return snackName + " 한 봉지 가격 : " + price;
	}

}
