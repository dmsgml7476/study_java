package study0207;

import java.util.Scanner;

public class Homework0206_A {

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
        
        int me=0, com=0, num=1;
        
        while(true) {// 언제 31이 나올지 모르니 무한루프로 전체를 반복
        	
        	System.out.print("숫자 몇개 : ");
        	me = sc.nextInt();
        	// 1~3 사이 값입력했는지 체크하는 반복문을 만들면 좋다.
        	System.out.print("나 : ");
        	for (int i=1; i<=me; i++) {
        		System.out.print((num++) + " ");
        		if (num == 32) break; // for 문 종료
        	}
        	if (num == 32) {
        		System.out.println("내가 졌어...");
        		break; //while 종료
        	}
        	
        	com = (int) (Math.random()*3 + 1);
        	System.out.print("\n컴픁터 : ");
        	for (int i = 1; i<=com; i++) {
        		System.out.print((num++) + " ");
        		if (num == 32) break;
        	}
        	if (num == 32) {
        		System.out.println("컴퓨터 패배!!승리~");
        		break; // while 종료
        	}
        	
        	
        }
        
        
        
        
        
        

	}

}
