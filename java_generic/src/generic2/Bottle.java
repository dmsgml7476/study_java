package generic2;

public class Bottle <T extends Alcohol>{  //제네릭 타입을 사용하는 클래스	
	T item;
	
	public /*<T extends Alcohol>*/ void make(T item) {
		System.out.println("만들기");
		this.item = item;
		System.out.println(item);
	}
	
	public T getItem() {
		return this.item;
	}
}


// 제네릭 타입의 제한
// T extends 부모 클래스명 => 부모와 자식만 가능
// T super 클래스명 => 해당 클래스와 클래스의 부모만 가능(형제 불가)

// 클래스 선언부가 아니라, 메서드 입력매개변수에 제네릭 타입 제한 설정을 해줄 수도 있다.
// 	public <T extends Alcohol> void make(T item) {}

// ? (whiled card) = 제한없이 누구든지 가능한 제네릭 타입. (보통 클래스가 아니라 메서드에 사용.)
// 메서드에서 단일로 제네릭 타입을 사용할때 사용해주면 됨.