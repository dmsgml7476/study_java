package inner2;

public class MainMt {

	public static void main(String[] args) {
		LocalClass lc = new LocalClass();
		lc.getBirth();
		// 지역 내부 클래스는 해당 메소드를 호출해야 사용가능
		
		Item item = new Item();
		item.sale();
		
		Item shoes = new Item() {
			// 익명 클래스가 사용하는 기존 클래스의 안의 메서드를 오버라이딩해서 사용
			
			@Override
			public void sale() {
				System.out.println("신발 판매");
			}
		}; // 익명 클래스는 기존의 클래스를 이용하여 제작. 익명 클래스의 정의와 객체 생성
		// Item 클래스가 부모 클래스가 되고, 익명 클래스가 자식 클래스가 되어 
		
		
		
		Item shoes1 = new Item() {
			@Override
			public void sale() {
				System.out.println("신발 판매");
			}
			
			public void make() {
				make();
				System.out.println("신발 만들기");
			}
		};// 익명 클래스 다시 정의하고 객체생성.
		shoes.sale();
//		shoes.make(); // 타입이 Item인데 Item에는 make가 없기 때문에 사용 불가. 익명 클래스 안에서만 사용가능
		Animal dog = new Animal() {
			@Override
			public void eat() {
				System.out.println("멍멍이가 밥먹는다.");
			}
		};  // 인터페이스를 imlements 한 익명 클래스 정의와 객체
		
		dog.eat();

	}

}

@FunctionalInterface
interface Animal {
	public void eat();// 추상 메서드(추상메서드는 객체 만들 수 없음)
}

/*



*/






class A {
	
}