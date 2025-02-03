package study0203;

import java.util.Scanner;

public class homework0203 {

	public static void main(String[] args) {
		// 과제 0203
		
		// 가위바위보 게임
		// 1. 가위, 2. 바위, 3.보
		
		// 내가 이겼는지, 졌는지, 비겼는지 출력
		
		
		
		Scanner scan = new Scanner(System.in);
		
		int user = 0, com = 0;
		
		System.out.print("1. 가위, 2. 바위, 3. 보");
		user=scan.nextInt();
		
		com = (int)(Math.random()*3+1);
		
		if (com == user) {
			System.out.println("비겼습니다");
			
		}
		}

	}

}
