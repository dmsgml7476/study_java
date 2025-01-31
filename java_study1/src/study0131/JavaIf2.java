package study0131;

import java.util.Scanner;

public class JavaIf2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		if (조건식) {  
//			조건식이 참일 경우 실행할 코드, 여러줄 가능
//		} else {
//			조건식이 거짓일 경우 실행할 코드, 여러줄 가능
//		}
//		
//		int 나이 = 25;
//        if (나이 >= 19) {
//        	System.out.println("성인입니다.");
//        } 
//        
//        System.out.println("청소년입니다.");
//        
//		//  ==> 두개는 별개라 성인입니다와 청소년입니다가 동시에 출력된다.
////        
//        if (나이 >= 19) {
//        	System.out.println("성인입니다.");
//        } else {
//        System.out.println("청소년입니다.");
//        }
//        
//        //  ==> else로 연결되었기에 성인입니다만 정상적으로 출력된다.
//        
//        
//        int money = 6400;
//        if (money >= 10000) {
//        	System.out.println("충전 안함");
//        	System.out.println("현재 잔액 : " + money);
//        } else {
//        	System.out.println("잔액 부족 " + (10000-money) + " 충전");
//        	money = (10000 - money) + money;
//        	System.out.println("현재 잔액 : "+ money) ;
//        	}
////        
//        // 간단한 문제
//        
//        // 사각형 너비와 높이이다. 
//        // 현제 사각형은 정사각형인가 직사각형인가?
//        int width = 53, height = 53;
//        
//        if (width == height ) {
//        	System.out.println("정사각형입니다.");
//        } else {
//        	System.out.println("직사각형입니다.");
//        }
//
//		int num = 0;
//		System.out.print("숫자 입력 : ");
//		num = scan.nextInt();
////		
////		// 입력한 숫자가 짝수인가 홀수인가?
////		
//		if (num%2 == 1) {
//			System.out.println("홀수");
//		} else {
//			System.out.println("짝수");
//		}
////		
////		8의 배수
////		num % 8 == 0
////
////		12의 약수
////		12%num == 0
//		
//		// if는 조건식이 하나밖에 존재하지 않는다. 조건식이 여러개 필요할 경우.
//		
//		int num = 15;
//		
//		if (num > 0) {
//			System.out.println("양수이다.");
//		} else {
//			if(num < 0) {
//			 System.out.println("음수이다");
//			} else {
//				System.out.println("0 이다");
//			}
//		}
////		
//		//  == else if 로 해주면 가독성이 더 좋다.
////		
//		if (num > 0) {
//			System.out.println("양수이다.");
//		} else if (num < 0) {
//			System.out.println("음수이다");
//		} else {
//			System.out.println("0 이다");
//		}
//		
//		
//		// 문제
//		int score = 81; // 100~90 은 A, 89~80은 B, 79~70은 C, 나머지는 F
//		if (score <= 100 && score >= 90) {
//			System.out.println("A 학점이다.");
//		}
//		else if (score >= 80) {
//			System.out.println("B 학점이다.");
//		}
//		else if (score >= 70) {
//			System.out.println("C 학점이다.");
//		} else {
//			System.out.println("F 학점이다.");
//		}
//		
//		// 순서대로 위의 조건이 거짓일 경우 아래의 조건으로 넘어간다. 
//		
//		
//		// 1 입력하면 데이터 저장이라고 출력
//		// 2 입력하면 데이터 삭제하고 출력
//		// 3 입력하면 종료라고 출력
//		// 1,2,3 이 아닌 숫자는 잘못입력했습니다. 라고 출력
//		// 정수를 입력하여 위 내용처럼 실행 될 수 읶세 만드세요.
//		
//		int num = 0;
//		System.out.print("메뉴를 선택 : ");
//		num = scan.nextInt();
//		
//		if (num == 1) {
//			System.out.println("데이터 저장");
//		} else if (num == 2) {
//			System.out.println("데이터 삭제");
//		} else if (num == 3) {
//			System.out.println("종료");
//		} else {
//			System.out.println("잘못입력했습니다.");
//		}
		
		

                            
	}

}


/*
 * 	[간단 복습]
 * 
 *  변수 : 데이터(값)을 저장하기 위한 메모리공간
 *  변수 이름 : 데이터가 저장된 공간을 사용하기위해서 부여하는 것.
 *  System.out.println(1000);    ┐
 *  int a = 1000;                | => 겉보기에는 같을지 몰라도, 둘은 다르다. 위는 출력과 동시에 사라지는 값이고, 아래는 변수로 재사용가능한 값이다.
 *  System.out.printIn(a);       ┘
 *  a = 123;
 *  a = 23;   ==> 변수이기 때문에 처음 넣어준 데이터가 절대적이지 않다. 언제든 바꿔줄 수 있다.
 *  
 *  변수 선언 : 데이터타입 정하기, 변수이름 정하기
 *          -> 사용할 데이터에 맞춰서 정해준다.
 *          -> int num; 데이터타입 변수이름;
 *          
 *  데이터타입 변환 (형변환)
 *     자동 형변환 : 데이터타입이 작은범위에서 큰범위로 데이터가 저장되는 경우 컴퓨터에서 자동적으로 변환시켜준다.
 *                ex) float a = 10;   ==> 원래라면 실수 타입인 a에 정수인 10이 들어가면 안되지만,
 *                                        정수보다 실수가 크기때문에 실수타입으로 자동 형변환된다.
 *                
 *     강제 형변환 : 데이터타입이 큰범위에서 작은범위로 데이터가 저장되는 경우.
 *                ex) int b = 2.14f  ==> 정수가 칠수보다 크기가 작기때문에 자동 형변환이 일어나지 않는다.
 *                    int b = (int)2.14f ==> 강제형변환을 해준다.
 *                    
 *  나누기 % : 나머지 구하기.
 *  ++, -- : 증감연산자(1씩 증가, 1씩 감소 변수 앞뒤 위치에따라 우선순위가 달라진다.)
*/
