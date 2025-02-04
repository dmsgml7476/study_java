package study0204;

import java.util.Scanner;

public class JavaLoo1 {

	public static void main(String[] args) {
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);피
		
		Scanner scan= new Scanner(System.in);
		
//		for (int i=num; i >= 1; i--) {
//			System.out.println("반복!!");
//		}
		/*
		 * for (int i=1; i <= 10; i++) { System.out.println("반복!!"); }
		 */

		/* 반복문 - for, while, do~while
		 * 반복 - 몇번을 번복할거냐, 몇번을 번복할건지 정하지 않고 하는 경우와 반봅횟수를 정하여 반복하는 경우
		 * 주로 반복횟수가 정해진 경우 for
		 * 반복횟수가 정해져있지 않은 경우 while*/
		
		// 6번 반복하는 반복문 만들기
		// 1부터 시작해서 6까지 1씩 증가
		// i=1; 1부터 시작하겠다.
		// i<=6; -> 6까지
		// i++ 또는 i=i+1 1씩 증가
		// for (int i=1; i<=6; i++
		
		// 정수 5부터 17까지 출력하는 반복문을 만드세요
		// for 함수의 범위가 거짓이 될때까지 출력한다.
		
		
		/*
		 * for (int i=5; i<=17; i++) { System.out.println(i); }
		 */
		
		
		// 총합 구하기
		// 1부터 10까지의 합 구하기
		// 누적된 값 + 1~10까지 순차적으로
		
//		int sum=0;
//		for (int num=1; num<=10; num++) {
//			sum = sum + num;
//		}
//		System.out.println("1부터 10까지 합 : " + sum);
		
		// 두개의 정수를 입력하여 두 수 중 작은 숫자부터 큰숫자끼지의 합을 구하세요.
		// 예) 1번째 숫자를 21 입력하고 2번째 숫자를 4 입력했다면
		//    4부터 21까지의 합을 구하기
		
		/*int num1=0, num2=0;
		
		System.out.print("num1 , num2 를 입력하시오 : ");
		num1=scan.nextInt();
		num2=scan.nextInt();
		
		
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;		
		}  // num1 값이 무조건 작은 수가 된다.=> 변수 small과 big을 만들 필요 없이 기존의 num1, num2 를 사용할 수 있다. 
		
		
		int small, big;
		if (num1>num2) {
			small = num1;
			big = num2;
		} else {
			small= num2;
			big = num2;
		}
		
		for (; small<=big; small++) {
			sum = sum + small;
		}
		System.out.println(sum);
		*/
		
//		System.out.println("2*1=" +(2*1));
//		System.out.println("2*2=" +(2*2));
//		System.out.println("2*3=" +(2*3));
//		System.out.println("2*4=" +(2*4));
//		
//		for (int i=1; i<=9; i++) {
//			System.out.printf("2*%d = %d \n",i,2*i);
//		}
//		
		// 내가 키보드로 입력한 숫자에 해당하는 구구단 출력하기
		
		int num = 0;
		
		System.out.print("몇단인지 입력하시오 : ");
		num=scan.nextInt();
		
		for (int i=1; i<=9; i++) {
			System.out.printf("%d*%d = %d \n",num, i, num*i);
		}
		

	}

}
