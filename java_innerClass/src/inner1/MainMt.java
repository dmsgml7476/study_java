package inner1;

public class MainMt {

	public static void main(String[] args) {
		
//		Test.A a = new Test.A(); // Test 내부 클래스 A는 인스턴스 변수임으로 이 방식으록 객체를 만들 수 없다.
		
		Test t = new Test(); // 1. 일단 외부 클래스인 Test의 객체를 만들어준다.
//		Test.A a = t.new A(); // 2. 내부 클래스 A의 객체를 만든다.
		
		t.setNum(10);  // 내부 클래스 노출 안됨
		t.innerView();
		
		t.a.num=10;  // 내부 클래스가 노출됨
		
		t.setYear(100);
		

//		
//		a.num=10;
//		a.num=20;
		
		// 정적 내부클래스를 굳이 노출 하면서 객체를 만들고자 한다면
		Test.Dog dof = new Test.Dog();
		
		Test.origin();  // static 메소드는 객체없이 사용가능.

	}

}
