package study0218;

public class Member {
	String name;  
	int age;
	String job;
	
	// 생성자 메서드
	
	Member(){  // 기본 생성자 메서드
		this.name="박문수";
		System.out.println(this);
	}
	// 오버 로딩 : 같은 이름의 메서드를 만드는 것.
	Member(int age, String job) {
		this.age=age;
		this.job=job;
	}
	
	Member(int age, String job,String name) {
		this.name=name;
		this.age=age;
		this.job=job;
	}
	
	// 오버 로딩 조건
	// 1. 메서드 이름이 같아야한다.
	// 2. 매개변수가 같으면 안된다.
	// 3. 매개변수 갯수가 달라도 성립
	// 4. 클래스 내부에서만 가능하다.
	
	// 자바 변수 종류
	// 인스턴스 변수
	// 지역변수
	// 클래스 변수

	
	// 생성자 메서드
	// 생성자 메서드는 자바에서 클래스 정의 할때
	// 기본 생성자 메서드도 같이 만들어진다.
	// 눈에 보이지 않게 생략 처리 된것이 지 없는 것은 아니다.
	// 생성자메서드는 클래스 객체 공간생성시
	// 인스턴스들의 초기화를 담당하는 메서드이다.
}
