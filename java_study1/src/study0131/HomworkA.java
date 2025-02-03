package study0131;

import java.util.Scanner;

public class HomworkA {

	public static void main(String[] args) {
		

		// 주말 과제
		// 싸다구 주차장 주차비 결제
		// 주차장의 기본 요금은 1000원이고 기본 시간은 30분이다.
		// 11분 주차해도 1000원이다.
		// 10분당 100원씩 추가 요금
		// 34분 주차하면 1000원, 40분 주차하면 1100원
		// 51분 주차하면 1200원
		// 2시간 주차시 기본요금은 1700원이다. 
		// 2시간 10분 주차하면 1800원 3시간 21분 주차하면 2500원.
		// 4시간 이상 주차시 기본요금은 2500원.
		// 4시간 15분 주차하면 2600원
		// 8시간 주차시 무조건 10000원
		// 주차 몇분 했는지 입력하여 주차요금이 얼마인지 출력하세요
		// 시간과 분 따로 따로 입력하기
		
		Scanner sc = new Scanner(System.in);
		
		int phour, pmin;
		int cost = 1000;
		int totalTime = 0; // 총 주차 시간(분) = 기본 시간을 제외한 나머지
		
	    System.out.print("주차 시간(시간, 분) : ");
		phour = sc.nextInt();
		pmin = sc.nextInt();
		
		totalTime = phour*60 + pmin;
		if (phour >= 8) {
			cost = 10000;
			totalTime = 0;
		} else if (phour >=4 ) {// 4시간 이상 주차시
			cost = 2500;
			totalTime -= 240;
		} else if (phour >= 2) {// 2시간 이상 주차시
			cost = 1700;
			totalTime -= 120;
		} else { // 2시간 미만 주차시
			totalTime = totalTime<30 ? 0 : totalTime-30;
		}
		
		int price = (totalTime/10)*100+cost;
		System.out.println("주차 요금 : " + price+ "원");
		// 계산을 해본 후에 코드를 짜기.

	}

}
