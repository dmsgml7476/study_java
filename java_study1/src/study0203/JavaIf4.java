package study0203;

import java.util.Scanner;

public class JavaIf4 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
//		int num = (int)(Math.random()*10);
//		// 0.0000000 ~ 0.999999999 = random
//		// 0.1...   => X10  => 정수 1
//		// 0.2...
//		// 0.3...
//		// ~
//		// 0.9...
//		
//		System.out.println(num);
//		
//		
//		
//		// 0 부터 5까지 나오도록
//		int num2 = (int)(Math.random()*6);
//		
//		System.out.println(num2);
//		
//		
//		
//		
//		//1~10
//		//rx10+1
//		
//		int user=0, coin=0;
//		System.out.println("1.앞면, 2.뒷면 :");
//		user= sc.nextInt();
//				
//		coin = (int)(Math.random()*2+1);
//		
//		if (coin==user) {
//			System.out.println("정답!!");
//		} else {
//			System.out.println("땡!!");
//		}
//		
//		// 컴퓨터가 동전을 15개 가지고 있다.
//		// 컴퓨터가 제시한 동전갯수가 짝인지 홀인지 맞추는 게임을 만드세요.
//		// 1.짝 2.홀
//		
//		
//		int user = 0, coin = 0;
//		
//		System.out.println("1.짝, 2.홀 : ");
//		user=sc.nextInt();
//		
//		coin = (int)(Math.random()*15+1);
//		if (coin%2 == 0 && user == 1) {
//			System.out.println("짝수, 정답");
//		} else if (coin%2 == 1  && user == 2) {
//			System.out.println("홀수, 정답");
//		} else {
//			System.out.println("땡");
//		}
//		
//		
//		
//		
//		int user = 0, coin = 0;
//		
//		System.out.println("1.짝, 2.홀 : ");
//		user=sc.nextInt();
//		
//		coin = (int)(Math.random()*15+1);
//		int com = (coin%2) + 1;
//		System.out.println(coin);
//		if (com == user) {
//			System.out.println("정답");
//		} else {
//			System.out.println("땡");
//		}
//		
//		
		// 랜덤 이용. 주사위 게임 ( 육면체 ) 
		// 컴퓨터가 주사위를 던진다.
		// 주사위 값이 3이하라면 작은 값, 주사위값이 4 이상이라면 큰값이다.
		// 1. 작다 2.크다
		// 주사위값이 작은값인지 큰값인지 맞추세요
		
		
		int user =0, com = 0;
		
		System.out.println("1.작다, 2.크다 : ");
		user=sc.nextInt();
		
		com = (int)(Math.random()*6+1);
		System.out.println(com);
		
		
		if (com <=3 && user == 1) {
			System.out.println("작은값이다. 정답");
		} else if (com >=4 && user == 2) {
			System.out.println("큰값이다. 정답");
		} else {
			System.out.println("땡!");
		}
		
		
		
		if (user == 1) {
			if (com <=3)
			    System.out.println("작은값이다. 정답");
			else
				System.out.println("틀렸습니다.");
		} else if (user == 2) {
			if (com >= 4)
			    System.out.println("큰값이다. 정답");
			else 
				System.out.println("틀렸습니다.");
		} else {
			System.out.println("1이나 2를 입력해주세요.");
		}
		
		
		if (user == 1 || user==2) {
			if (com <=3 && user == 1)
			    System.out.println("작은값이다. 정답");
			else if(com >=4 && user == 2)
			    System.out.println("큰값이다. 정답");
			else
				System.out.println("틀렸습니다.");
		} else {
			System.out.println("1이나 2를 입력해주세요.");
		}
		
		
		
		

		
				

	}

}
