package study0121;

public class Java_print {

	public static void main(String[] args) {
		
		System.out.println(" 한줄에 하나씩 출력 !@#!$!");
	    System.out.print(" 한줄에 이어서 출력 ");
	    System.out.print(" 그 다음 이어서 출력 ");
	    
	    // 한줄에 하나씩 출력할지 이어서 출력할지 자유롭게 결정할 수 있는 명령문.
	    
	    System.out.printf("그냥 print 처럼 사용 가능");
	    System.out.printf(" println 처럼 \n 하려면 \n");
	    System.out.printf(" 다음줄에 \n 출력 \n");
	    System.out.printf("%d", 100);
	    System.out.printf(" %% ");  // 형식 지정자에 %가 들어가서 '%'를 넣고 싶으면 두번 넣어야 출력이 가능하다.	    
	    
	    
	    // %d = 형식 지정자 (서식문자) | 뒤에있는 데이터를 표현하기 위한 지정자.
	    
//	    %d, %i = 10진수 정수
//	    %f = 10진수 실수
//	    %c = 문자
//	    %s = 문자열
//	    %d = boolean 타입
	    
	    // 형식 지정자를 사용하기 위해 주의 할것
	    
	    // 1. 형식지정자와 데이터 위치를 맞춰야한다.    
	    System.out.printf(" %d %f ", 100, 3.14);
	    
	    // 2. 형식 지정자와 데이터 갯수 맞추기
	    System.out.printf(" %d %d %d ", 10, 20, 30);
	    // System.out.printf(" %d %d ", 10, 20, 30);   // 10, 20만 출력
	    // System.out.printf(" %d %d %d ", 10, 20);  // 오류
	    
	    System.out.println(2025+"년" + 1 + "월" + 21 + "일");
	    System.out.printf("%d년 %d월 %d일 \n", 2025, 1,21);
	    
	    float fnum = 5.12345f;
	    System.out.println("println 출력 : " + fnum);
	    System.out.printf("printf 출력 %f \n", fnum);
	    System.out.printf("printf 출력 %.1f \n", fnum);   // 소수점 자리 지정
	    
	    int num = 15;
	    System.out.println(num);
	    System.out.printf("%d\n", num);
	    System.out.printf("%4d\n", num);   // 자리수 확보
	    System.out.printf("%-4d\n", num);  
	    
	    
	}

}
