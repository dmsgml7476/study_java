package customer;

import store.Fruit;

public class Buyer {
	private int money;
	private Fruit item;              // 구매한 음료 또는 컵과일 저장 변수

	public Buyer(int money) {  // Buyer 객체 생성시 동작할 생성자 메서드
		this.money=money;
	}
	
	
	// 변수에 private 이 붙었기때문에 set, get 메서드가 필요하다.

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Fruit getItem() {
		return item;
	}

	public void setItem(Fruit item) {
		this.item = item;
	}
	
	@Override
	public String toString() {
	     return ("고객은 " + money + "원 가지고 있습니다");
	}

	
	
}
