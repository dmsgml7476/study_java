package study0207;

import java.util.Scanner;

public class Homework0207 {

	public static void main(String[] args) {
		/*
		 * 오늘의 과제 - 숫자 야구
		 * 
		 * 1~9 중의 임의의 숫자 3개를 뽑아낸다. (중복없이)
		 * 
		 * 3개의 숫자를 맞추기 해야한다.
		 * 예) 임의의 숫자 - 7 1 8
		 * 입력 : 1 2 3
		 * 결과 : 0 스트라이크 1볼 2아웃
		 * 입력 : 4 7 9
		 * 결과 : 0스트라이크 1볼 2아웃
		 * 입력 : 4 1 8
		 * 결과 : 2스트라이크 0볼 1아웃
		 * 
		 * 스트라이크 : 자리와 숫자가 맞음 값과 위치가 맞음.
		 * 볼 : 숫자는 맞음
		 * 아웃 : 숫자와 자리도 틀림
		 * 스트라이크가 볼보다 작은 범위
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		int user_1=0, user_2=0, user_3=0, com_1=0, com_2=0, com_3=0, str=0, ball=0, out=0;
		
		
		
		com_1 = (int)(Math.random()*9+1);
		com_2 = (int)(Math.random()*9+1);
		com_3 = (int)(Math.random()*9+1);
		
		if (com_1 != com_2 && com_2 != com_3 && com_3 != com_1) {
			System.out.println(com_1 + " " + com_2 + " " + com_3);
			while (true) {
				System.out.print("숫자를 맞추세요 : ");
				user_1 = sc.nextInt();
				user_2 = sc.nextInt();
				user_3 = sc.nextInt();
				
//				
//				if (user_1 != com_2 && user_1 != com_2 && user_1 != com_3)
//					ball++;
//				if (user_2 != com_2 && user_2 != com_2 && user_2 != com_3)
//					ball++;
//				if (user_3 != com_2 && user_3 != com_2 && user_3 != com_3)
//					ball++;
//				
				
				if (user_1 == com_2 || user_1 == com_3) 
					ball++;
				if (user_2 == com_1 || user_2 == com_3) 
					ball++;
				
				if (user_3 == com_1 || user_3 == com_2) 
					ball++;
				
				if (user_1 == com_1) 
					str++;
			
				if (user_2 == com_2) 
					str++;
				if (user_3 == com_3) 
					str++;
				
				
				
				
				System.out.println("스트라이크 : " + str + "볼 : " + ball + "아웃 : " + out);
				
				
				
				
			}	
		} else {
			System.out.println("값이 동일합니다 새로고침해주세요");
			return;
		}

		

		
		
		
	}

}
