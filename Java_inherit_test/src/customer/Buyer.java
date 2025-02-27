package customer;

import java.util.Date;

import store.Fruit;

public class Buyer {
	private int money;
	private Fruit item;              // 구매한 음료 또는 컵과일 저장 변수
	private Date buyDate;   // 자

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
	
    public void buyDate(Date buyDate) {
    	this.buyDate = buyDate;
    }
	
	public Date getBuyDate() {
		return buyDate;
	}


	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}


	@Override
	public String toString() {
	     return ("고객 남은돈 : " + money + "원 " + "구매일 : "+ this.buyDate + " 구매음료 : " + this.item);
	    
	}

	
	
}
