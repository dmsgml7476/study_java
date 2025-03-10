package generic3;

public class 예감 extends Snack {
	
	public 예감 (String snackName, int price) {
		super(snackName, price);
	}
	
	@Override   // toString은 Object(최상위 객체)에서 상속받아와서 사용하는 거기 때문에
	public String toString () {
		return snackName + " 한 박스 가격  : " + price;
	}
	// 오버라이딩 조건 : 제어자부터 매개변수까지 일치해야한다.
}
