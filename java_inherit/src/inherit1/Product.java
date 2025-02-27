package inherit1;

public abstract class Product { //부모클래스
	protected boolean onOff = false;
	protected String brand; // 브랜드
	protected int price; // 가격
	protected String name; // 제품명 - lg휘센, 캐리어A32
	
	public Product() {
		System.out.println("부모클래스 생성");
	}
	
	public Product(String brand, int price, String name) {
		this.brand = brand;
		this.price = price;
		this.name = name;
	}
	
	
	public abstract void power(); // 내용이 필요하지 않기 때문에 추상 메서드 사용.
	// 자식 클래스에서 오버라이딩 하기 때문에
	// 부모는 추상적인 메서드로 만들기만 하면 된다.
	// 추상메서드는 반드시 추상 클래스에서만 가능하다.
	
	// 추상 클래스는 객체 생성이 불가
	// 추상 클래스는 추상메서드를 가질 수 있는 클래스이다.
	// 추상 메서드는 메모리의 크기를 얼마나 할당해야하는지 
	// 측정 불가 하기때문에
	// 객체 공간 할당이 안된다.
	// 객체 공간 할당 받으려면 얼마의 메모리가 필요한지 
	// 측정이 되어야 한다.
	

	
}
