package study0206;

import java.util.Scanner;

public class Homework_A {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===UP & DOWN 게임(컴퓨터 버전)===");
		System.out.print("1~50 중 하나 입력 : ");
		int number = scan.nextInt(); // 내가 입력한 숫자를 컴퓨터가 맞춘다.
		int max =50, min=1, t=50;
		
		while(true) {
			int com = (int)(Math.random()*t+min);; // 20
			System.out.println("컴퓨터 : "+com);
			if (number == com) {
				System.out.println(com);
				break;
			}
			if (number > com) {
				System.out.println("up");
				min = com +1;
				t=max-com;
			}
			if (number < com) {
				System.out.println("down");
				max = com -1;
				t= max -min+1;
			}
			
		}

	}

}
