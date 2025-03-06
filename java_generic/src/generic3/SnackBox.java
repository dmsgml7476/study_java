package generic3;

public class SnackBox <T extends Snack>{
	T 과자;
	public void makeBox (T 과자봉지) {
		this.과자 = 과자봉지;
		System.out.println("┌─────────────────────────┐");
		System.out.println("│  " +과자봉지 + " │");
		System.out.println("└───────박스 포장 완료───────┘");
	}
	
	public void test() {
		System.out.print("테스트 : " + this.과자);	}
	
	public T getItem() {
		return this.과자;
	}
	

}
