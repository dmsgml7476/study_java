package study0210;

import java.util.Scanner;

public class Homework0210 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1, n2, n3;
		
		do {
		n1= (int)(Math.random()*9 +1);
		n2= (int)(Math.random()*9 +1);
		n3= (int)(Math.random()*9 +1);
		} while( !(n1 != n2 && n1 != n3 && n2 != n3));
		// 3개의 숫자가 중복없이 1~9 중의 하나를 가진다.
		
		
		while (true) {
			System.out.print("숫자 세개 : ");
			int u1 = scan.nextInt();
			int u2 = scan.nextInt();
			int u3 = scan.nextInt();
			
			int ball=0, str=0;
			
			if (n1==u1) str++;
			if (n2==u2) str++;
			if (n3==u3) str++;
			
			if (n1== u2|| n1==u3) ball++;
			if (n2== u1|| n2==u3) ball++;
			if (n1== u2|| n1==u3) ball++;
			
			System.out.printf("%d 스트라이크 %d 볼 %아웃 \n", str, ball, 3-str-ball);
			if (str==3) break;
		}
		
		
		
		
		
	}

}
