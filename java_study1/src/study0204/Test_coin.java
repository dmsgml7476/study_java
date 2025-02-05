package study0204;

import java.util.Scanner;

public class Test_coin {

	public static void main(String[] args) {

		
		/* 동전 앞뒷면 맞추기 게임을 10판 진행

           10번 게임을 하는동안 몇 번 맞췄는지 출력

           가위바위보
        */
		
		Scanner sc = new Scanner(System.in);
		
		
		int user =0, coin=0, win=0;;
		
		
		for (int num=1; num<=10 ; num++) {
			System.out.print("동전 1.앞면, 2.뒷면을 맞추세요 : ");
			user=sc.nextInt();
			
			coin = (int)(Math.random()*2+1);
			//System.out.println(coin);
			
			if (user == coin) {
				System.out.println("정답입니다!");
				win = win+1;
			} else {
				System.out.println("땡!");
			}
		}
		System.out.println("맞춘 횟수 : " + win + " 번");

	}

}
