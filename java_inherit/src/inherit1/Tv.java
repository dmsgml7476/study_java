package inherit1;

public class Tv extends Product{ // 자식 클래스
	public Tv() {
//		super(); //부모클래스의 생성자 메서드가 반드시 먼저 실행된다.
		//super 는 부모 클래스의 객체를 의미한다.
		 System.out.println("자식클래스 생성");
	}
	
	public Tv(String brand, int price, String name ) {
		super(brand, price, name);

		
	}

	//오버로딩 : 같은 클래스 내에서 메소드 명이 같고 매게변수가 다른.
	// 오버라이딩
	// 상속관계인 경우, 인터페이스 implements 인 경우에 사용.
	// 성립 조건 
	// 1. 메서드의 원형은 그대로 유지
	// 2. 내용만 변경한다.
	// 3. 상속 또는 implement 인 경우에만 가능
	// //<= 사람에게 하는 주석, @<= 컴퓨터에게 거는 주석
	
	@Override
	public void power() {
		onOff=!onOff;
		System.out.println("Tv 전원 : " + onOff);
	}


}
