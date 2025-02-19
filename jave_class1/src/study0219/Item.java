package study0219;

public class Item {
	
	//인스턴스 변수
	String name;  //상품명
	String brand;  //브랜드명
	int amount;  //수량
	
	Item(){};  // 기본 생성자
	
	Item(String name, int amount) {
		this.name = name;
		this.amount = amount;
	}
	
	Item(String name, String brand, int amount) {
		this.name = name;
		this.brand = brand;
		this.amount = amount;
	}
}
