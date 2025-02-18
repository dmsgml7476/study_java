package study;

public class JavaMain {

	public static void main(String[] args) {
		// 데이터 저장 - 변수

		// 같은 타입의 많은 양의 데이터 - 배열
		
		// 이름, 나이, 직업, 몸무게, 시력, 생년월일
		// 100 명의 데이터를 저장하기 위해서는 서로 다른 종류의 데이터이기에 100의 크기인 1차원배열
		// 6개를 만들어야한다.
		
		// String[] names = new String [100];
		// int[] a
//		
//		struct member { // 구조체 - member 타입
//			String name;
//			int age;
//		}
//		member info; // member 타입의 변수 info
//		info.name = "김유신";
//		info.age = 24;
//		
//		member[] mem = new member[100];
		
		// 기본 데이터 타입으로 선언한 변수는 데이터 직접 저장이 가능
//		int num=10;
//      베열 또는 클래스 타입으로 선언한 변수는 참조 변수이다.
//      참조 변수에는 메모리주소를 저장한다.
//      그래서 자바에서는 new 연산자 통해서 공간을 할당받아 그 공간의 주소를 저장.
	
		
		Member info = new Member();
		info.name = "김유신";
		info.age = 30;
		
		System.out.println(info.name);
		
		Member my = new Member(); // 인스턴스 생성 (객체 생성)
		my.name="박문수";
		my.age=25;
		
		//  인스턴스 : 객체, 클래스에 name이 들어가는 공간, age 가 들어가는 공간 등등
		
		// 동물 종류, 동물 이름, 나이
		// 동물 종류에는 개, 고양이, 닭, 토끼, 코끼리 등등
		// 동물 이름은 볼트, 렉스, 웅이, 꼬끼오, 총총이 등등
		// 나이는 하고 싶은 나이 아무거나
		// 동물 한마리에 대해서 데이터를 입력하고 출력
		
		
		Animal dog = new Animal();
		dog.type = "개";
		dog.name = "볼트";
		dog.age = 3;
		
		Animal cat = new Animal();
		cat.type = "고양이";
		cat.name = "렉스";
		cat.age = 5;
		
		Animal chicken = new Animal();
		chicken.type = "닭";
		chicken.name = "꼬끼오";
		chicken.age = 3;
		
		Animal rabbit = new Animal();
		rabbit.type = "토끼";
		rabbit.name = "총총이";
		rabbit.age = 2;
		
		Animal elephant = new Animal();
		elephant.type = "코끼리";
		elephant.name = "웅이";
		elephant.age = 7;
		


		
		Animal myfind = new Animal();
		myfind.type = "고앙이";
		myfind.name = "삼색이";
		myfind.age = 9;
		
		System.out.println("종 : " + myfind.type);
		System.out.println("이름 : " + myfind.name);
		System.out.println("나이 : " + myfind.age);

		
	
	}
}

class Member { // 클래스의 정의 -클래스안의 내요으로 데이터 저장될 수 있게 만들겠다고 정의 한것
	String name;
	int age;
	float eyes; 
}


class Animal {  // 동물 정보 저장 클래스
	String type; // 동물 종류
	String name; // 동물 이름
	int age;  // 동물 나이
}


// 여러 종류의 데이터를 저장, 기능 구현
// 클래스 - 사용자 정의 데이터 타입
// class 클래스 이름 {   }   -> 처럼 작성
// 클래스 이름은 첫글자 대문자로
// 프로그래밍 명명 규칙 (name rule)
// 1. 카멜 표기법
//    첫문자를 제외하고 단어의 첫글자를 대문자로 표현
//	  myVisitorCount
//    함수, 인스턴스, 객체, 변수
// 2. 스네이크 표기법
//    모든 단어 사이에 _를 붙여서 이름 짓기
//    my_visitor_count
//    데이터베이스의 테이블명, 컬럼명
// 3. 파스칼 표기법
//	  카멜 표기법과 유사하지만 첫 문자부터 대문자로 표기
//    MyVisitorCount
//    객체지향 언어의 클래스나 constructor 명
// 4. 케밥 표기법
//    카멜 표기법과 달리 소문자로 표현하며 단어와 단어사이에 - 붙이기
//    my-visitor-count
//    css 의 class명, web url






