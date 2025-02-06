package study0206;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		 * 문제 1 - 무한루프
		 * 정수한개씩 계속 입력받기
		 * 입력하다가 0을 입력하면 
		 * 지금까지 입력한 모든 숫자의 합 출력
		 * 
		 * 문제 2 - 무한루프
		 * 컴퓨터와 가위바위보 게임하기
		 * 내가 10번 이길때까지 게임 계속하기 
		 * 10변 이기면 그동안 몇번 패배하고 비겼는지 출력
		 */
		
		// 문제 1
		Scanner sc = new Scanner(System.in);
//		
//		int user = 1, sum=0;
//		
//		
//		while (true) {
//			System.out.print("정수를 입력하시오 : ");
//			user = sc.nextInt();
//			
//			if (!(user==0)) {
//				System.out.println(user);
//				sum += user;
//			} else {
//				System.out.println("총합 : " + sum);
//				break;
//			}
//			
//		}
//		
//		// 문제 2
//		
//		
//		int me=0, com=0, win=0, lose=0, same=0;
//		System.out.println("가위바위보 게임");
//		while (true) {
//			
//			System.out.print("1.가위 2.바위 3.보 : ");
//			me = sc.nextInt();
//			
//			com = (int)(Math.random()*3+1);
//			
//			
//			if (me == com) {
//				System.out.println("비겼다");
//				same++;
//			} else if (me == 1 && com == 2 || me == 2 && com == 3 || me == 3 && com == 1) {
//				System.out.println("졌다");
//				lose++;
//			} else {
//				System.out.println("이겼다");
//				win++;
//			} 
//			if (win==10) {
//				System.out.println("10번 이기는 동안 " + lose + " 번 패배하고 " + same+ " 번 비겼다.");
//				break;
//			}
//		}
//		
		/* 문제 3번
		    컴퓨터와 주사위게임을 한다.
		    각각 주사위 2개를 던져서 주사위 합이 큰 쪽이 이긴다.
		    5판을 진행 했을 때 몇승 몇배 몇무인지 출력
		    단, 주사위 2개가 같은 숫자라면 합이 작아도 이긴다.
		    둘다 같은 숫자가 나왔을 때 합이 끈쪽이 이긴다.
		    예) 나 - 3, 4 컴 - 1,3 내가 이김
		       나 - 5,6 컴 - 1,1 컴퓨터가 이김
		*/
		
		
		int mydice_1 = 0, mydice_2=0, comdice_1 =0, comdice_2 =0, game=0, win=0, lose=0, same=0;
		
		
		System.out.println("주사위 게임!");
		
		
		
		
		
		while (true) {
			System.out.print("1. roll : ");
			int meroll_1 = sc.nextInt();
			System.out.println("내 첫번째 주사위 : " + mydice_1);
			System.out.println("컴퓨터 첫번째 주사위 : " + comdice_1);
			mydice_1 = (int) (Math.random()*6+1);
			comdice_1 = (int) (Math.random()*6+1);

			System.out.print("2. roll : ");
			int meroll_2 = sc.nextInt();
			System.out.println("내 두번째 주사위 : " + mydice_2);
			System.out.println("컴퓨터 두번째 주사위 : " + comdice_2);
			mydice_2 = (int) (Math.random()*6+1);
			comdice_2 = (int) (Math.random()*6+1);
			
			int sum_me = mydice_1 + mydice_2;
			int sum_com = comdice_1 + comdice_2;
			
            System.out.println("내 주사위 총합 : " + sum_me);
            System.out.println("컴퓨터 주사위 총합 : " + sum_com);
            
            
            if (mydice_1==mydice_2) {
            	System.out.println("내 주사위 숫자가 같다! 내가 이겼다!");
            	game++;
            	win++;
            } else if (comdice_1 == comdice_2) {
            	System.out.println("컴퓨터 주사위 숫자가 같다! 내가 졌다!");
            	game++;
            	lose++;
            } else {
            	if (sum_me > sum_com) {
                	System.out.println("내가 이겼다!");
                	game++;
                	win++;
                } else if (sum_me < sum_com) {
                	System.out.println("내가 졌다!");
                	game++;
                	lose++;
                	
                } else if (sum_me == sum_com) {
                	System.out.println("비겼다!");
                	game++;
                	same++;
                }
            	
            } 
            
            if (game==5) {
            	System.out.println("총 5판 중 승리 " + win + "번, 패배 " + lose + "번, 무승부 "+ same + "번이다.");
            	break;
            }
				
			
			}

			
		
		
		
		

	}

}
