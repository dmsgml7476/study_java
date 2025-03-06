package generic3;

public class 매운새우깡 extends Snack {
	
	public 매운새우깡 (String snackName, int price) {
		super(snackName, price);
	}
	
	@Override
	public String toString () {
		return snackName + " 한 봉지 가격 : " + price;
	}

}
