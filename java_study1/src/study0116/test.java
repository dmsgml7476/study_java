package study0116;

public class test {

	public static void main(String[] args) {
        // 주석 - 설명이나 메모, 코드 대기 등등
		/* 
		 * 여러 줄 주석 - 주석은 프로그램으로 실행되지 않는 부분이다.
		 * 주석안에 코드 작성해도 실행 안된다. 각 코드의 설명을 작성하는 용도로 사용하면 됨.
		 * 저장 단축키 - ctrl + s
		 * 주석 단축키 - ctrl + /
		 * 실행 단축키 - ctrl + f11
		 * */
		System.out.println("자바 이클립스 테스트");
		// 데이터 사용 하려면 변수를 선언해야한다.
		// 변수를 선얼할때는 반드시 데이터 타입을 정해야한다.
		// 변수의 이름은 저장할 데이터에 밎는 의미 있는 이름으로 짓기
		// 정수 : int, byte, short, long
		// 실수 : float, double
		// 문자 : char
	    // 논리 : boolean
		int age;
		age = 100; // age 변수에 100 저장 (대입연산)
		age = 27;
		age = '가'; // 자바에서 '' 표현은 문자를 의미
				   // "" 표현은 문자열을 의미
	    System.out.println(27);
	    System.out.println(27);
	    
	    byte num1 = 120;
	    System.out.println(num1);
//	    num1 = 130    // 오류 : byte(127) 범위 초과
	    
	    int num2 = 20; // 변수 선언하면서 데이터 저장 - 변수 초기화
	    
	    int num3 = 43; 
//	    num3은 43이다. 라고 하면 안됨. num3과 43이 같다는 표현이라.
//	    num3에 43을 저장했다, num3에 43을 대입했다. 라고 표현
	    
	    System.out.println();
	   	System.out.println(num2 + num3);
	   	
	   	int sum = num2 + num3;
	   	System.out.println(sum);
	   	
//	   	사각형의 너비와 높이 값으로 넓이를 구하세요.
//	   	
//	   	int area = width + height;
//	   	int width=20;
//	   	int height=30;
//	   	
	   	// 코드 실행은 순차적이기 때문에 area 변수 값이 존재하지 않는 변수이기때문에 오류이다.
//	   	
//	   	int width;
//	   	int height;
//	   	int area = width + height;
//	   	int width=20;
//	   	int height=30;
	   	
	   	// 변수는 선언했지만, 변수의 값이 지정되지 않았기때문에 area에서 변수 이름으로 이용할 수 없다.
	   	
	   	int blue = 20;
	   	int red = 15;
	   	int white = 0;
	   	
	   	// 파란컵에 오랜지주스가 20ml있다.
	   	// 빨간컵에 딸기 주스가 15ml 있다.
	   	// 파란컵에 딸기주스를, 빨간컵에 오랜지주스를 담으려면 어떻게 해야하는가?
	   	// blue와 red 값을 출력
	   	// blue=15, red=20 은 아님
	   	
	   	white = blue;
	   	blue = red;
	   	red = white;
	   	
	   	System.out.println(blue);
	   	
	   	System.out.println(red);
	   	
	   	int birthYear = 1991;
	   	// 김철수가 태어난 년도를 birth_year에 저장했다.
	   	// 나이는??
	   
	   	int myAge = 2025 - birthYear;
	   	
	    System.out.println(myAge);
	    
	    // 변수란 데이터(값)을 저장할 수 있는 메모리 공간
	    // 변수의 공간에는 데이터타입에 맞는 데이터만 저장 할 수 있게 해줘야한다.
	    // 변수의 선언은 데이터 타입 변수명 (예 - int num;)
	    // 변수이름은 카멜 표기법이 일반적이다.
	    // 변수이름은 변수의 사용목적에 맞는 이름으로 한다.(길어도됨)
	    
	    float fnum = 2.156f;  // 자바에서는 실수를 표현할때 뒤에 f 를 붙여준다!
	    System.out.println(fnum)
	    ;
	    fnum = 2.123456789f;
	    System.out.println(fnum);
	    double dnum = 1.1234567890123456789;
	    System.out.println(dnum);
	    
	    char ch='a';
	    System.out.println(ch);
	    ch = '가';   // char 는 문자열을 처리 할 수 없다. "" <= 문자열로 처리되기 때문에 반드시 '' <= 문자로 인식되는 작은 따옴표를 사용한다.
	    System.out.println(ch);
	    ch = 97;
	    System.out.println(ch);
	    ch = 'H';
	    System.out.println(ch - 'A');
	    System.out.println('J' - 64);
	    
	    String name = "홍길동";  // 자바에서 문자열 사용하기 위해선 String이라는 클래스 타입 사용
	    
	    boolean isApple = true; // 참, 거짓 값을 가지는 타입.
	    
	    
	}
	
}
