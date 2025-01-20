package study0120;

public class homework {
	
	// 1월 20일 과제
//	사과상자에 사과가 20개 들어있다.
//	오렌지 상자에 오렌지가 15개 들어있다.
//
//	사과 상자는 11개 오랜지상자는 12개 있다면
//	과일은 총 몇개인가.
	
	int appleBox = 20;
	int appleBoxnum = 11;

	int orangeBox = 15;
	int orangeBoxnum = 12;
	

	int totalApple = appleBox * appleBoxnum;
	int totalOrange = orangeBox * orangeBoxnum;

	int totalNum = totalApple + totalOrange;

	System.out.println("과일 총 개수 : " + totalNum);
	
}
