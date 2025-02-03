package study0131;

import java.util.Scanner;

public class HomworkA {

	public static void main(String[] args) {
		
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
