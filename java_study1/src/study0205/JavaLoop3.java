package study0205;

import java.util.Scanner;

public class JavaLoop3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		// 동전 앞뒷면 맞추기 게임
		// 내 돈이 바닥 날때 까지 게임 진행!!
		
		System.out.print("당신이 가지고 있는 돈은? : ");
		int money=scan.nextInt();
		final int 판돈=1000; // final = 이게 붙어있는 변수는 값 변경이 불가능하다. 즉. 상수다.
		int win=0;
		
		while(true) {
			int coin = (int)(Math.random()*2+1); // 1.앞 , 2. 뒤
			System.out.print("1.앞면, 2.뒷면 : ");
			int user = scan.nextInt();
			if (user == coin) {
				System.out.println("정답!");
			    win++; }
			else
				System.out.println("땡!");
			money -= 판돈; // 1번 진행시 1000원씩 감소.
		    if(money<판돈) break;
		}
		
		
		
		
		
//		// 21~49 -> * 29 + 21
//		int com = (int)(Math.random()*50+1);
//		// 조건식이 참일 경우에만 반복문이 실행
//		while(true) {
//			System.out.print("정수 입력 : ");
//			int num = scan.nextInt();
//			if (num == com) {
//				System.out.println("정답!");
//				break;
//			} 
//			if (com>num)
//				System.out.println("up");
//			if (com <num)
//				System.out.println("down");
//		}
//		
////		// 과제 내가 제시한 숫자를 컴퓨터가 맞추도록하기.
//		// 1~50 중 하나를 내가 입력한다
//		// 내가 입력한 숫자를 컴퓨터가 맞춰야한다. (random 사용)
//		// 무작위로 맞추는 게 아니고 범위를 좁히면서 맞출 수 있도록 해야한다.
//		
//		
		//for (초기값; 조건식; 증감식)
		//for(i=1; i<=10; i++);
		// 반복 횟수가 정해져 있는 경우 for 문이 가독성이 좋다.
		// 반복 횟수가 없는 경우 while 문이 가독성이 좋다.
		
//		int i = 1;// 초기값
//		
//		while(i<=10 /* 조건식 */) {
//			System.out.println(i);
//			i++;  // 증감식
//		}
//		

	}

}
