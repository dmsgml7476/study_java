package store;

public class Orange extends Fruit {
	public Orange (int cost, int capacity) {
		super(cost, capacity);
	}
	
	@Override
	public void makeJuice() {
		System.out.println("포도 주스 제조");
	}

	
	
	@Override
	public void pieceFruit() {
		System.out.println("포도 8알");
	}
	@Override
	public String toString() {
	     return ("오랜지 " + cost + "원 " + capacity + "ml");
	}

}
