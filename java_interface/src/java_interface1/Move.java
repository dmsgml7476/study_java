package java_interface1;

public interface Move  {
	
	public void moving(); // 추상메서드
	
////	private int num; // 인스턴스 변수 선언 불가
//	public static int cnt; // 클래스 변수 선언 가능
//	public final float pi=3.14f; // 상수 선언 가능
//	
//	public abstract void out(); // 추상메서드
//	public void sum(); // 추상메서드

}

// 객체라 하면 인스턴스 변수 또는 메서드의 공간이 존재하는 것을 의미한다.
// 인터페이스는 인스턴트변수 또는 메서드를 가질 수 없고 객체를 생성못함

//부모클래스가 가지고 있는 메서드중
//자식이 변경하지 못하게 할 메서드가 있다면 final을 붙이면 된다.