package generic1;

public class MainMt {

	public static void main(String[] args) {
		
		Drink<String, String> d = new Drink<String, String>();
		
		d.name = "토마토 주스";
		d.ml=350;
		d.경림추천("토마토");

	}

}


/*
 
 
 제네릭 - 속에 특유한, 속명 상표명 - 일반명 
 		- 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 방법	
 		- 제네릭 타입으로는 무조건 클래스타입, 인터페이스만 가능. 기본 타입은 안됨. 
 		-> int : integer 클래스로 제네릭 타입 사용가능.
 		
 		Integer m; // int 기본타입의 자바 클래스명 : 이때 m은 참조변수가된다.
 		Float f; // float 기본타입의 자바 클래스명
 		Double d; // double 기본타입의 자바 클래스명.
 		Byte bt; // byte 기본타입의 자바 클래스명.
 		Short s; // short 기본 타입의 자바 클래스명.
 		Character c; // char 기본 타입의 자바 클래스명.
 		Boolean // boolean 기본 타입의 자바 클래스명

 		class A {
 			int num;
 			flloat fnum;
 			String name;
 		}
 		
 		class B {
 			int num;
 			String fnum;
 			String name;
 		}
 
 */





