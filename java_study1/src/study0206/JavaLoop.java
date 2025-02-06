package study0206;

import java.util.Scanner;

public class JavaLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int user=0;
		do {
			System.out.print("1.가위 2.바위 3.보 ");
//			user = sc.nextInt();
		} while (!(user>=1 && user <=3));
		
		
//		int user=0;
//		while(!(user>=1 && user <=3)) {
//			System.out.print("1.가위 2.바위 3.보 ");
//			user = sc.nextInt();
////			if (user>=1 && user <=3) break;
//		}
//		System.out.println("가위바위보 진행");
//		
		
//		int a = 10;
//		do {
//			System.out.println("do ~ while 문");
//			a++;
//		} while(a <15);
//		
//		// 초기값 -> {내용} -> 조건식 비교 -> 참이면 -> {내용} : 조건 비교가 뒤에 있기에, 초기값이 조건식에 맞지 않아도 일단 1번은 실행된다.
//		
//		// for|while 의 경우
//		
//		// 초기값 -> 조건식 비교 -> 참이면 -> {내용} -> 증감식
//		
//		
//		int i=1; //i의 값을 초기화 (for 에서는 신경쓰지 않아도 된다)
//		while (i<=3) {
//			int k=1;  // k의 값을 초기화
//			while(k<=2 ) {
//				System.out.println("i = " + i + "   k=" + k);
//				k++;
//			}
//			i++;
//		}
//		
//		
//		for(i=1; i<=3; i++) {
//			for (int k=1; k<=2; k++) {
//				System.out.println("i = " + i + "   k=" + k);
//			}
//		}

	}

}
