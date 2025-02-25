package inherit1;

public class JavaInherit1 {

	public static void main(String[] args) {
		Tv tv = new Tv();
		

//		
		tv.onOff = true;  // 전원 on
		tv.power();  //전원 on
		tv.power();  // 전원off
		tv.brand="삼성";
		tv.price = 1200000;
		tv.name = "OLED ST60";


		
		Computer com = new Computer();
		com.onOff= true; //

	}

}


/*

상속 - 클래스들의 관계를 부모-자식 관계로 설정한다.
	부모 클래스의 변수 또는 메서드를 자식 클래스에서 사용가능하다.
	여러 클래스들의 공통요소를 부모클래스로 구성한다.
	예) TV, 컴퓨터, 냉장고, 에어컨, 전기(파워), 플러그, 가격, 브랜드 등등등
	가전제품 부모 클래스에, 파워 ,가격, 브랜드를 정의한다.
	
	다형성 - 다양한 형태	
		TV t = new TV();
		Computer com=new Computer();
		
		가전제품 tv = new Computer();
		가전제품 com = new Computer();
	
	css에서 글자색을 red로 설정한다.
	<div id = "a">
		<div class = "b"></div>
		<ul class="c"></ul>
		<p class-="d"></p>
	</div>
	
	#a

*/