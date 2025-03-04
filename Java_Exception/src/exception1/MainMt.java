package exception1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMt {

	public static void main(String[] args) {
		// 예외처리 - 코드 실행에 있어서 예외적인 부분을 처리하기 위한 방법
		// 예외적인 상항이 발생하는 것은 올바른 실행이 이루어지지 않아서
		// 오류 또는 에러가 발생한다.
		// 자바에서 예외처리는 오류에 대한 처리이다.
		// 예외 처리는 오류를 해결하는 방법이 아닌 회피하는 방법이다.
		
//		int a;  // 초기화를 하지 않아서
//		System.out.println(a+10); // 오류 발생

		int a = 10;
		
		Scanner sc = new Scanner(System.in);
		
		try { // 오류가 예상되는 코드를 try{}에 작성한다.
			System.out.println("a 변수 입력 : ");
			a = sc.nextInt();
			System.out.println("나누기 전");
			System.out.println(a/2); // 0으로 나누기를 하려 해서 오류
			System.out.println("나누기 후");
		} catch(ArithmeticException e) { // try 안에서 발생한 오류를 변수 e에 저장. 0으로 나누려고 한 오류만 잡음.
			System.out.println("0으로 나누기하면 안되용");
			
		} catch( Exception /*InputMismatchException*/ i) { // ArithmeticException, InputMismatchExceptiond의 부모인 Exception을 사용하면 된다.
			System.out.println("정수 입력해야돼!");
		}
		System.out.println("프로그램 종료");
		
		//try 구문에서 오류가 발생하면 catch 구문이 실행된다.
		//catch 구문이 실행 되려면 발생한 오류를 처리할 수 있는 
	}

}
