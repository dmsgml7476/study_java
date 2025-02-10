package study0207;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		 /*문제 4
		    *
		    **
		    ***
		    별을 위 와 같이 출력하세요
		    힌트> 첫번째 줄이라서 별 한개 두번째 줄이라서 별두개
		    세번째 줄이라서 별세개 (이중 for문)
		    
		    문제 5.
		    
		    1 2 3 4
		    5 6 7 8
		    9 10 11 12
		    
		    숫자를 위와 같이 출력하세요.(이중 for문)
		    
		    문제 6. - 비밀번호 찾기
		    1. 비밀번호는 4자리로 구성 되어있다.
		    2. 비밀번호 각각의 숫자는 1~9 중의 하나이고, 중봅없다.
		    3. 첫번째 숫자는 네번째 숫자보다 2만큼 크다.
		    4. 두번째 숫자는 세번째 숫자보다 작다.
		    5. 비밀번호와 비밀번호 역순의 숫자를 더하기 하면
		       16566이다. 예) 1234 + 4321 
		       6. 위의 조건을 모두 충족하는 비밀번호 출력
		    
		 */
		
		// 문제 4번
//		
//		int line=0, star=0;
//		
//		for (line=1; line <=3; line++) {
//			
//			for (star=1; star<=line; star++) {
//				System.out.print("*");
//			}
//			
//			
//			System.out.println();
//		}
//		
//		// 문제 5번
//		
//		int num = 1;
//		
//		for (int line = 1; line<=3; line++) {
//			for (int i =1; i<=4; i++) {
//				System.out.print(num + " ");
//				num++;
//			}
//		System.out.println();
//		}
//		
//		for (int i=0; i<=2; i++) {
//			for(int k=i*4; k<=(i*4)+3; k++) {
//				System.out.print(k + " ");
//			}
//			System.out.println();
//		}
//		
//		
//		// 문제 6
//		
//		
//
//		
//	
//		for (int a =3; a <= 10; a++) {
//			// 첫번째 숫자 돌리기
//			for (int b=1; b <=9; b++) {
//				// 두번째 숫자 돌리기
//				for (int c=2; c <=10; c++) {
//					//세번째 숫자 돌리기
//					for (int d = 1; d <= 8; d++) {
//						//네번째 숫자 돌리기
//						
//						if (a!=b && a!=c && a!=d && b!=c && b!=d && c!=d) {
//							if (a > d) {
//								if (b < c) {
//									int pw = a*1000 + b*100 + c*10 + d;
//									int rpw = d*1000 + c*100 + b*10 + a;
//									
//									if((pw+rpw)==16566) {
//										System.out.println(pw);
//										break;
//									}
//									
//								}
//							}
//						}
//						
//						
//						
//						
//					}//네번째 숫자 돌리기
//				}//세번째 숫자 돌리기
//			}// 두번째 숫자 돌리기
//		}// 첫번째 숫자 돌리기
		
		//문제 7. - 알파벳 찾기 (반드시 반복문을 이용)
		// 알파벳(대문자 또는 소문자 모두 가능하게) 입력
		// 입력한 알파벳이 몇번째 알파벳인지 찾기 - 반드시 for문으로
		
		Scanner sc= new Scanner(System.in);
		
		int line=0;
		
		
//		System.out.print("알파벳을 입력하라 : ");
//		char user = sc.next().charAt(0);
//		
//		
//		for (char i = 'A'; i <='Z'; i++ ) {
//			line++;
//			// 아스키 코드에서 A - 65 (10진수), a - 97 (10진수)
//				
//			if (user == i) {
//				System.out.println(line);
//			}
//		
//			
//		}
		
		System.out.print("알파벳을 입력하라 : ");
		char alp = sc.nextLine().charAt(0);
		
		for (int i = 1; i <=26; i++ ) {
//			// 아스키 코드에서 A - 65 (10진수), a - 97 (10진수)
			if(alp == (i+64) || alp==(i+96)) {
				System.out.printf("알파벳 %c는 %d번째 알파벳 \n", alp, i);
				break;
			}
		}
		

		
		
		
	}

}
