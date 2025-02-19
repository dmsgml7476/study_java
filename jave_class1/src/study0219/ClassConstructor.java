package study0219;

public class ClassConstructor {

	public static void main(String[] args) {
		Food f1 = new Food("돈가스", 8000);
		
		System.out.println(f1.foodName);
		
		Food f2 = new Food();
		
		Item info1 = new Item();
		info1.name="옷걸이";
		info1.amount=1000;
		info1.brand="노브랜드";
		System.out.println(info1.name + " " + info1.brand
				+ " " + info1
				.amount);
		
		
		
		Item info2 = new Item("캐릭터양말", 500);
		System.out.println(info2.name + " " + info2.amount);
		
		Item info3 = new Item("노트북", "삼성", 20);
		System.out.println(info3.name + " " + info3.brand
				+ " " + info3
				.amount);
		
		

	}

}

/*

	상품
	상품명, 브랜드, 수량
	
	상품을 등록하고자 하는데 필요한 클래스를 정의하고
	상품 정보 저장하기위한 생성자메서드를 아래와 같이 구현
	- 기본 생성자 메서드
	- 상품명과 수량 초기화 가능한 생성자 메서드
	- 상품명, 브랜드, 수량 초기화 가능한 생성자 메서드


*/



/*

	메서드 
	출력타입(반환타입) 메서드이름(매게변수) {메서드 내용}
	
	int sum (int a, int b) { 
		int num1 = a;
		int num2 = b;
		System.out.prinln(num1+num2);
	}
	
	int x=23, y=2435;
	sum (x, y);

*/





