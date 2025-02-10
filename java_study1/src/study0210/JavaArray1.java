package study0210;

import java.util.Scanner;

public class JavaArray1 {

	public static void main(String[] args) {
		// 변수 : 값(데이터, 주소 등등 ) 을 저장하기 위한 메모리 공간
		int a=20;
		a=10;
		
		
		//배열 : 같은 데이터 타입의 연속적인 메모리 공간
//		          다른점 => 변수공간 여러개 연속적으로 사용
		
//		자바 스크립트 배열 : let arr= []; let arr =new Array
//		const arr= [1, arrp] [a];
		
		// 자바 선언 방법
		
//		int[] arr +
//		arr[2]=20; // 3번째 공간 , 두번째 X
		
		int [] arr = new int [5]; // 5개 공간으로 이루어진 배열 선언
		int [] arr2 = new int [] {1, 20 ,50, 15};  // 4개의 공간 배열 선언
		
		// 자바 배열 사용법
		
		
		arr [2] = 20; // 배열 3번째 공간에 20 저장
		System.out.println(arr[2]);
		arr[0] = 10;
		arr[1] = 30;
		arr[3] = 40;
		arr[4] = 60;
		
//		
//		for (int i=0; i<=4; i++) {
//		      System.out.println(arr[i]);
//		}
		
		
		// 베열의 각각의 공간을 표현하려면 인덱스로 표현해야한다.
		//인덱스는 0부터 시작한다
		//그래서 반복문의 초기값은 0으로 지정하면 된다.
		//반복문의 조건식은 배열 인덱스의 마지막 까지 표현 될 수 있게 하면 된다.
		//배열의 크기 (공간 갯수)가 8이라면 마지막 인덱스는 7
		//조건식 i<= 7 하면 된다.
		
		for (int i=0; i<=3; i++) {
		      System.out.println(arr2[i]);
		}
		
		int [] apple = new int[10];
		// 참조 변수를 사용하려면 배열인경우 인덱스를 객체인 경우는 . 접근 연산자를.
//	    Scanner[] ab = new Scanner[50];
//	    ab[0];
	    // Scanner라는 이름의 클래스 타입이다.
		
		Scanner sc = new Scanner(System.in);
		// 배열에 데이터 입력
		
		for (int i=0; i<=9; i++) {
			System.out.print("숫자 입력 : ");
			apple[i] = sc.nextInt();
			
		}
		
		// apple.length -> 배열의 크기(공간갯수)
		// 실수데이터는 정확도가 100%가 아니라 잘못 처리 될수도 있다.
		// 배열의 크기는 반드시 10진수 정수로 지정
		
		for (int i=0; i<apple.length; i++) {
			System.out.println("배열값 : " + apple[i]);
		}
		
		// 배열을 사용하면 하나의 변수로 많은 양의 데이터 저장가능.
		// 자료구조 : 배열
		// 링크드리스트 => 배열하고 약간 구조가 다르다.
		
		// 배열의 단점 : 크기 변경 불가. 한 번 정해놓은 크기는 프로그램 실행 중에 변경 불가.
		
		// 배열의 크기가 클수록 삭제나 삽입이 오래 걸린다.
	    

	}

}
