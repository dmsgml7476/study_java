package study0204;

import java.util.Scanner;

public class Test_R_P_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int user=0, com=0, win=0;
		
		for (int num = 1; num <=10; num++) {
			System.out.print("1.가위, 2.바위, 3.보 : ");
			user=sc.nextInt();
			
			com = (int)(Math.random()*3+1);
			if (user == com) {
				//System.out.println(com);
				System.out.println("비겼다");
			} else if ((user==1 && com==2) || (user==2 && com==3) || (user==3 && com==1)) {
				//System.out.println(com);
				System.out.println("졌다");
			} else {
				//System.out.println(com);
				System.out.println("이겼다");
				win = win + 1;
			}
		}System.out.println("이긴 횟수 : " + win + " 번");

	}

}
