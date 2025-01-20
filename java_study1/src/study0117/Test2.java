package study0117;

public class Test2 {
	public static void main(String[] args) {
		
		int num = 20;
		float pi = 3.14f;
		
		num = (int) pi;   //  강제 형변환 =일시적으로 타입을 바꿈.
		pi = num;     // 자동 형변환
		
		//데이터 타입 바꾸는 방식 2가지 : 강제 형변환 (큰쪽에서 작은쪽으로 들어갈때) | 자동 형변환 (작은쪽에서 큰 쪽으로 들어갈때)
		
		// 문제 풀이
		
		int a=2;
		
		int 한개피단축 = 2;
		int 일년 = 365;
		int 흡연기간 = 20;
		int 하루담배 = 5;
		
		int 단축수명 = 하루담배 * 한개피단축 * 일년 * 흡연기간;
		int 단축수명시간 = 단축수명 / 60;
		int 단축수명일 = 단축수명시간 / 24;
		
		System.out.println("총 단축시간(분) : " + 단축수명);
		System.out.println("총 단축시간(시간) : " + 단축수명시간);
		System.out.println("총 단축시간(일) : " + 단축수명일);
		
		
		int appleBox = 20;
		int orangeBox = 15;
		int appleBoxnum = 11;
		int orangeBoxnum = 12;
		
	    int totalApple = appleBox * appleBoxnum;
	    int totalOrange = orangeBox * orangeBoxnum;
	    
	    int totalNum = totalApple + totalOrange;
	    
	    System.out.println("과일 총 개수 : " + totalNum);
	    
	    
	    
	}

}


