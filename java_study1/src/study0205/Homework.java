package study0205;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
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
//		// 과제 내가 제시한 숫자를 컴퓨터가 맞추도록하기.
		// 1~50 중 하나를 내가 입력한다
		// 내가 입력한 숫자를 컴퓨터가 맞춰야한다. (random 사용)
		// 무작위로 맞추는 게 아니고 범위를 좁히면서 맞출 수 있도록 해야한다.

		int com = 0, com_max =50, com_min =1;
		System.out.print("컴퓨터가 맞출 정수를 제시하시오: ");
		int user = scan.nextInt();
		
		com = (int)(Math.random()*com_max+com_min);
		
		while (true) {
			
			if (com == user) {
				System.out.println(com);
				System.out.println("정답!");
				
				break;
			} else {
				if (com > user) {
					System.out.println(com);
					System.out.println("down");
					
					com_max = com;
					
					com = (int)(Math.random()*com_max+com_min);
					
				}
				else {
					System.out.println(com);
					System.out.println("up");
					com_max = (com_max - com);
					com_min = com;
					com = (int)(Math.random()*(50-com)+com_min);}
			
			}
				
			
		}
		
		
	}

}
