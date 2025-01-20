package study0120;

import java.util.Scanner;

public class Test {
	
	//변수=데이터를 저장하기 위한 메모리 공간
//	변수이름 - 데이터가 저장된 공간을 사용하기 위해 부여한 별명
//	변수 선언 방법 - 데이터타입 변수이름 (예 - int num;)
//	저장할 데이터에 맞는 데이터 타입을 설정해야한다
//	변수이름의 첫글자는 문자로, 자바 예약어는 사용불가

//	자바에서 결과로 출력 하는 방법

//	System.out.println(“출력하는 방법”);

//	자바에서 키보드를 통해 데이터 입력하는 방법
//	자바에서 입력하기 위한 순서
//	1.입력 객체 생성
//	2.입력 객체를 통해 데이터에 맞는 입력에서도 호출

	
	Scanner input = new Scanner(System.in);
	
	//num 이라는 변수에 정수 데이터입력하여 저장하기
	//nextInt()가 정수 데이터 입력하기 위한 메서드이다.
	
	int num = input.nextInt();


}
