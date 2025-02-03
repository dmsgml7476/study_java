package study0131;

import java.util.Scanner;

public class HomeworkIf {

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
		
		Scanner scan = new Scanner(System.in);
		

        
        
		int default_minute = 30;  // 기본시간
		int cost = 1000;  // 기본요금
		int cost_2h = 1700;  // 2시간 기본요금
		int cost_4h = 2500;  // 4시간 기본요금
		int pTime_h = 0;  // 주차시간 (시간)
		int pTime_m = 0;  // 주차시간 (분)
		int tenM= 100;  // 10분에 100원 추가요금
		int price = (pTime_m/10)*tenM + cost;

		
		System.out.print("주차 시간(분) : ");
		pTime_m=scan.nextInt();
		System.out.print("주차 시간(시간) : ");
		pTime_h = scan.nextInt();
		
		if (0<pTime_m && pTime_m <= default_minute && pTime_h == 0) {
			System.out.println("주차 요금 : "+cost + " 원");
		}
		else if (pTime_h < 2) {
			pTime_m = pTime_h*60 + pTime_m - 30;
			cost= (pTime_m/10)*tenM + cost;
			System.out.println("주차 요금 : "+cost + " 원");
		}
		else if (pTime_h == 2 && pTime_m < 10) {
			System.out.println("주차 요금 : " + cost_2h + " 원");
		}
		else if (pTime_h < 4) {
			pTime_m = pTime_h*60 + pTime_m - 120;
			cost_2h= (pTime_m/10)*tenM + cost_2h;
			System.out.println("주차 요금 : "+cost_2h + " 원");
		}
		else if (pTime_h == 4 && pTime_m < 10) {
			System.out.println("주차 요금 : " + cost_4h + " 원");
		}
		else if (pTime_h < 8) {
			pTime_m = pTime_h*60 + pTime_m - 240;
			cost_4h= (pTime_m/10)*tenM + cost_4h;
			System.out.println("주차 요금 : "+cost_4h + " 원");
		} else {
			System.out.println("주차 요금 : 10000 원");
		}
		
<<<<<<< HEAD
		// 반복되는 것을 줄이려 노력해보자!!!!!!!!!!!!!!!!
		
=======
>>>>>>> refs/remotes/origin/main
	}

}