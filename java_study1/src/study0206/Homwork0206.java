package study0206;

import java.util.Scanner;

public class Homwork0206 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		/* 		 오늘 의 과제 
		     베스킨라빈스 31 게임 만들기
		     나와 컴퓨터 둘이서 진행
		     31을 제시하는 쪽이 패배
		     나 부터 시작 한다.
		     숫자 몇개를 제시할것인지 갯수를 입력하면 자동으로 숫자가 나온다.
		     컴퓨터는 랜덤을 이용해서 몇개 제시할것인지 해야한다.
		     숫자는 1개 부터 3개까지 가능
			
			예시)
			나 - 몇개 ? 2
			나 : 1  2 
			컴 : 3 
			나 - 몇개 ? 1
			나 : 4 
			컴 : 5  6  7 
			나 - 몇개 ? 3
			나 : 8  9  10 
			컴 : 11  12 
			나 - 몇개 ? 3
		*/
		
		System.out.println("베스킬라빈스 31 게임 시작!");
		
		int me=0, com=0, num = 1, box_1=0, box_2=0, box_3=0;
		
		
		
		
		
		while (true) {
			System.out.println("========================== \n");
			System.out.print("몇 개를 선택할 것인가? : ");
			me=sc.nextInt();
			
			System.out.println("\n나");
			
			
			if (me == 1) {
				box_1 = num++;
				
				if (box_1 == 31) {
					System.out.println(box_1);
					System.out.println("당신이 졌습니다! \n============(끝)===========");
					break;
				}
				
				System.out.println(box_1);
				
			} else if (me == 2) {
				box_1 = num++;
				box_2 = num++;
				
				if (box_1 == 31) {
					System.out.println(box_1 + "/n");
					System.out.println("당신이 졌습니다! \n============(끝)===========");
					break;
				}
				if (box_1 == 30) {
					System.out.println(box_1 +" " + box_2 + "/n");
					System.out.println("당신이 졌습니다! \n============(끝)===========");
					break;
				}
				System.out.println(box_1 +" " + box_2 + "\n");
				
			} else if (me == 3) {
				box_1 = num++;
				box_2 = num++;
				box_3 = num++;
				
				if (box_1 == 31) {
					System.out.println(box_1);
					System.out.println("당신이 졌습니다! \n============(끝)===========");
					break;
				}
				if (box_1 == 30) {
					System.out.println(box_1 +" " + box_2 + "/n");
					System.out.println("당신이 졌습니다! \n============(끝)===========");
					break;
				}
				if (box_1 == 29) {
					System.out.println(box_1 +" " + box_2 +" " + box_3 + "/n");
					System.out.println("당신이 졌습니다! \n============(끝)===========");
					break;
					
				}
				
				System.out.println(box_1 +" " + box_2 +" " + box_3 + "\n");
			}
			com = (int) (Math.random()*3+1);
			System.out.println("컴퓨터");
			if (com == 1) {
				box_1 = num++;
				
				
				
				if (box_1 == 31) {
					System.out.println(box_1 + "\n");
					System.out.println("당신이 이겼습니다! \n");
					System.out.println("============(끝)===========");
					break;
				}
				
				System.out.println(box_1 + "\n");
				
			} else if (com == 2) {
				box_1 = num++;
				box_2 = num++;
				
				
				if (box_1 ==31) {
					System.out.println(box_1 + "\n");
					System.out.println("당신이 이겼습니다! \n");
					System.out.println("============(끝)===========");
					break;
				}
				if (box_1 == 30) {
					System.out.println(box_1 +" " + box_2 + "\n");
					System.out.println("당신이 이겼습니다! \n");
					System.out.println("============(끝)===========");
					break;
				}
				System.out.println(box_1 +" " + box_2 + "\n");
			} else if (com == 3) {
				box_1 = num++;
				box_2 = num++;
				box_3 = num++;
				
				if (box_1 ==31) {
					System.out.println(box_1 + "\n");
					System.out.println("당신이 이겼습니다! \n");
					System.out.println("============(끝)===========");
					break;
				}
				if (box_1 == 30) {
					System.out.println(box_1 +" " + box_2 + "\n");
					System.out.println("당신이 이겼습니다! \n");
					System.out.println("============(끝)===========");
					break;
				}
				if (box_1 == 29) {
					System.out.println(box_1 +" " + box_2 +" " + box_3 + "\n");
					System.out.println("당신이 이겼습니다! \n");
					System.out.println("============(끝)===========");
					break;
					
				}
				System.out.println(box_1 +" " + box_2 +" " + box_3 + "\n");
				
			}
			
			
		}
		
		
		
	}
}
