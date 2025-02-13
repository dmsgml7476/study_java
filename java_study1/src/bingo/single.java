package bingo;

import java.util.Scanner;

public class single {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		
		int[] game = new int[25];
		
		int idx=0;
		// game 배열에 값 채우기
		int wit_1 = 0, wit_2 =0, wit_3=0, wit_4=0, wit_5=0, 
		len_1 = 0, len_2 =0, len_3=0, len_4=0, len_5=0, 
		cro_1 = 0, cro_2 =0, bingo=0;
		
		
		
		while(true) {
			int temp = (int) (Math.random()*25+1);
			boolean isSame = false;
			for (int i=0; i<idx; i++) {
				if (game[i]==temp)
					isSame=true;
			}
			if (!isSame)
				game[idx++]= temp;
			if (idx==game.length) break;
		}
		

		
//		
//		// 5줄 5칸 출력
//	
		
		while(true) {
			for (int i=0; i<=4; i++) { // 빙고판 출력부분
				for (int k=0; k<=4; k++) {			
					if(game[i*5+k]==0) {
						System.out.printf(" %2s ", "■");
					}
					else
					System.out.printf(" %2d ", game[i*5+k]);
				}
				System.out.println();
			}
		    
			
			if (bingo == 5) {		    	
				System.out.println("빙고 승리!");
				break;}
			
			
		    
			System.out.print("숫자 선택 : "
					+ "");
			int num = scan.nextInt(); // 빙고판에 있는 숫자 입력
					
			
			for (int i=0; i<game.length; i++) {
				if (game[i] == num) {// 내가 입력한 숫자를 배열에서 찾기
					game[i] = 0;
					if (i<=4 || i==0) {wit_1++;}
					else if (i<=9) {wit_2++;}
					else if (i<=14) {wit_3++;}
					else if (i<=19) {wit_4++;}
					else if (i<=24) {wit_5++;}
					
					
					if (i%5 == 0) {len_1++;}
					if (i%5 == 1) {len_2++;}
					if (i%5 == 2) {len_3++;}
					if (i%5 == 3) {len_4++;}
					if (i%5 == 4) {len_5++;}
					
					if (i%6 == 0) {cro_1++;}
					if (i%4 == 0  && i != 0 && i != 24) {cro_2++;}
				}
				
			}
			if (wit_1 == 5) {bingo++; System.out.println(bingo + "줄 빙고 성공!"); wit_1 =0;}
			if (wit_2 == 5) {bingo++; System.out.println(bingo + "줄 빙고 성공!"); wit_2 =0;}
			if (wit_3 == 5) {bingo++; System.out.println(bingo + "줄 빙고 성공!"); wit_3 =0;}
			if (wit_4 == 5) {bingo++; System.out.println(bingo + "줄 빙고 성공!"); wit_4 =0;}
			if (wit_5 == 5) {bingo++; System.out.println(bingo + "줄 빙고 성공!"); wit_5 =0;}
			
			if (len_1 == 5) {bingo++; System.out.println(bingo + "줄 빙고 성공!"); len_1 =0;}
			if (len_2 == 5) {bingo++; System.out.println(bingo + "줄 빙고 성공!"); len_2 =0;}
			if (len_3 == 5) {bingo++; System.out.println(bingo + "줄 빙고 성공!"); len_3 =0;}
			if (len_4 == 5) {bingo++; System.out.println(bingo + "줄 빙고 성공!"); len_4 =0;}
			if (len_5 == 5) {bingo++; System.out.println(bingo + "줄 빙고 성공!"); len_5 =0;}
			
			if (cro_1 == 5) {bingo++; System.out.println(bingo + "줄 빙고 성공!"); cro_1 =0;}
			if (cro_2 == 5) {bingo++; System.out.println(bingo + "줄 빙고 성공!"); cro_2 =0;}
			
			System.out.println(bingo);
			
			
		}
		
		
		
		
//		
//		// 빙고게임은 5줄 빙고 되면 종료되도록.
//		// 1줄 빙고인지, 두줄 빙고인지 확인할 수 있는 코드 필요. (인덱스의 규칙을 잘 보아라. i와 k를 잘보아라.)
//		
//		// 숫자 중복으로 안들어가도록 하기.
//		
//		
//		// (추가) 컴퓨터도 하도록 2인용 게임으로 만들기(컴퓨터도 게임 승리를 위한 선택을 하도록)
//		
//		

	}

}
