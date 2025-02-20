package study0220;

public class JavaMethod {
	
	// 메서드에 반환 값(출력값)이 없는 경우 void 타입으로 작성
	
	
	// 메서드를 정의한것.
	// 반환과 매개변수 없는 메서드 형태
	// 외부 데이터도 필요없고 출력하는 값도 없기때문에
	// 대부분 단순 출력용이 많다. 메뉴같은거.

	static void output () {
		System.out.println("반환이 없는");
		System.out.println("매게변수도 없는 메서드");
	}
	
	// 변환없고 매게 변수 있는 메서드
	// 메서드의 내용을 실행하는데 필요한 데이터를 가지고 있지않다면
	// 메서드 외부에서 데이터를 가져와야한다.
	
	static void sum(int num1, int num2) {
		System.out.println("합 : " + (num1+num2));
	}
	
	static void sum(int num1, float num2) {
		System.out.println("합 : " + (num1+num2));
	}
	
	
	// 반환이 있고 매개변수 필요없는 메서드 - int num = scan.nextInt();
	// 매개변수가 필요 없기 때문에 자체적으로 필요한 데이터를 생성 할 수 있거나
	// 클래스 객체가 가지고 있는 인스턴스변수의 데이터를 가공(계산같은거) 하여
	// 외부로 내보내기 위한 목적인 경우
	
	static int total() { //메서드(출구)가 같은 타입이여야만 한다.
		int a=10, b=20, c=30;
		int tot = a+b+c;
		return tot;  // 나가는 변수와
	}

	
	
	// 반환, 매게변수가 있는 메서드. name.equals("박문수");
	
	static String game(int val) {
		if (val == 1)
			return "가위";
		if (val == 2)
			return "바위";
		if (val == 3)
			return "보";
		return "잘못입력"; // 반환이 있는 메서드에서 if 문으로 return 했다면
				        // 참일 경우에만 동작할 수 있기 때문에 별도의 return 필요
		}
	
	// 두 개의 정수중 큰 값을 출력하는 것 만들기
	// 두 정수 비교하고 출력하는 메서드 필요
	// 반환없고 매개변수 있는 메서드로!!
	
	static void bignum(int num1, int num2) {
		if (num1>num2) {
			System.out.println("큰 수 : " + num1);
		} else
			System.out.println("큰 수 : " +num2);

				
	}
	// 국어 점수 : 88, 영어점수 : 91, 수학점수: 74
	// 세과목의 총점과 평균을 출력하세요.
	// 총점 계산하는 메서드, 평균 계산하는 메서드
	
//	static void testsum (int kor, int eng, int math) {
//		int sum = kor + eng + math;
//		System.out.println("총합 :" + sum);
//	}
//	
//	static void testavg (int kor, int eng, int math) {
//		int sum = kor + eng + math;
//		int avg = sum/3;
//		System.out.println("평균 :" + avg) ;
//	}
//	
//	
//	static int testsum2() {
//		int kor=88, eng = 91, math = 74;
//		int sum = kor + eng + math;
//		return sum;
//	}
//	
//	static int testavg2() {
//		int kor=88, eng = 91, math = 74;
//		int sum = kor + eng + math;
//		int avg = sum/3;
//		return avg;
//	}
	
	static int total(int k, int e, int m) {
		int tot = k+e+m;
		return tot; // 내보내기
	}
	
	static void avgCalc (int tot) {
		int avg = tot/3;
		System.out.println("평균 : " + avg);
	}
	
	

	
	
 	public static void main(String[] args) {
 		
 		int kor=88, eng=91,mat=74;
 		total(kor, eng, mat);
 		int totScore = total(kor, eng, mat);
 		avgCalc(totScore);
 		
 		System.out.println("총점 : " + totScore);
 		
 		
 		String res = game(2);
 		System.out.println(res);
 		
		int num = total();
		
		output();
		sum(1, 100);
		
		bignum(4, 2);
		
//		testsum(88, 91, 74);
//		testavg(88, 91, 74);
//		
//		int sum =testsum2();
//		int avg =testavg2();
//		
//		System.out.println(sum);
//		System.out.println(avg);



	}

}
