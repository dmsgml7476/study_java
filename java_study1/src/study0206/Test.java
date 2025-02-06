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
		
		int user = 1, sum=0;
		
		
		while (true) {
			System.out.print("정수를 입력하시오 : ");
			user = sc.nextInt();
			
			if (!(user==0)) {
				System.out.println(user);
				sum = sum + user;
			} else {
				System.out.println(sum);
				break;
			}
			
		}
		
		// 문제 2
		
		
		int me=0, com=0, win=0, lose=0, same=0;
		System.out.println("가위바위보 게임");
		while (true) {
			
			System.out.print("1.가위 2.바위 3.보 : ");
			me = sc.nextInt();
			
			com = (int)(Math.random()*3+1);
			
			
			if (me == com) {
				System.out.println("비겼다");
				same++;
			} else if (me == 1 && com == 2 || me == 2 && com == 3 || me == 3 && com == 1) {
				System.out.println("졌다");
				lose++;
			} else {
				System.out.println("이겼다");
				win++;
			} 
			if (win==10) {
				System.out.println("10번 이기는 동안 " + lose + " 번 패배하고 " + same+ " 번 비겼다.");
				break;
			}
		}
		

	}

}
