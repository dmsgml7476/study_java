package study0122;

import java.util.Scanner;

public class JavaOp3 {

	public static void main(String[] args) {
		// 비교연산자 - 두개 데이터를 비교하여 참, 거짓 결과
		
//		System.out.println(10 > 5);
//		System.out.println(11 < 4);
//		
		Scanner scan = new Scanner (System.in);   // Scanner 사용시 위에 inport java.util.Scanner; 필수로 추가
		
//		int num;
//		
//		System.out.print("정수 입력 : ");
//		num = scan.nextInt();
//		
//		System.out.println("5보다 큰 숫자인가? " + (num > 5) );
//		boolean big;
//		big = num >= 10;
//		
//		System.out.println("10 이상인가? " + big);
//		
//		System.out.println(10 == 10);  // 두 숫자가 같다
//		System.out.println(10 == 13); //
//		
//	    String word = "가나다"; // 문자열의 타입은 String 클래스 타입
//	    String word2 = new String ("가나다");
//	    
//		System.out.println("word" == "word2");
//		// == 비교 연산자는 비교하는 2개의 값이 같은 자료형인지 판별
//		// 문자열 비교는 이런 식으로 해서는 안된다
//		
//		System.out.println("가나다" == "가나다");
//		// 보통 문자열은 String을 통해 객체로 만들어서 사용함으로 이런 식으로 비교할 일은 없다.
//		// 대부분 위의 경우로 비교를 하게 되는데, 위의 식은 객체가 다르기때문에 같지만 다르게 인식된다.
//		// 고로 다른 비교법이 필요하다.
//
//		// 문자열 비교하는 법
//		System.out.println(word.equals(word2));
//		System.out.println('a' > 'b');
//		
//		System.out.println(10 != 5);
//		
//		
//		// 놀이동산에 가서 바이킹을 타는데 키가 149 이상 만 탈 수 있다.
//		
//		int tall;
//	    System.out.print("키 : ");
//	    tall = scan.nextInt();
//	    System.out.println(tall >= 140);
//	    
//	    // 바이킹 탑승조건 : 키 140 이상에서 190 이하
//	    // 비교연산자로 만들어진 조건식이 여러개인 경우 논리연산자를 사용
//	    
//	    System.out.println(tall >= 140 && tall <= 190);
	    // 140 <= tall <=190
//	    System.out.println(140 <= tall <= 190);
	    
	    // 비교 데이터 타입 불일치
	    
	    // 청소년 버스요금은 1000원이다. (청소년은 13세부터 19세)
	    // 나이를 입력받아서 청소년이면 false 아니면 true가 출력되게 하세요
	    
	    int age;
	    System.out.print("나이를 입력하세요 : ");
	    age=scan.nextInt();
	    
	    System.out.println(!(age < 13 || age > 19));
	    
	    // 조건식 - 비교연산자와 논리 연산자를 사용하여 만든식
	    // 조건식 만드는 연습 해야한다.
	    // total > count
	    
	    
		

	}

}
