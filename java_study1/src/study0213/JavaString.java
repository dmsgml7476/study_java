package study0213;

import java.util.Scanner;

public class JavaString {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		
		
		System.out.print("나이 : ");
		int age = scan.nextInt();
		
		System.out.print("이름 : ");
		name = scan.nextLine();
		
		// 문자 입력으로 nextLine()은 쓸때는 앞에 숫자를 받은 적이 없어야한다. 만약 앞에 숫자를 입력받는 코드가 있으면, 문자 입력이 되지 않는다.
		// 숫자를 입력받는 코드 앞에 써준다.*** 순서가 중요하다 ****
		
		System.out.println(age + " " + name);
		
		// 키보드로 입력하면 버퍼에 쌓인다.
		// next() 는 엔터 입력시 엔터 입력 되기 전에 입력한 버퍼에 쌓인 값으 가져온디2.
		// nextLine 은 버퍼에 엔터가 있어야 버퍼갓을 가져온다.
		
		// 파일 불러오기(읽기) 하면 버퍼의 영향을 받을 수도 있다.
		//next()를 이용해서 문자열 입력 받는 것이 무조건 답은 아니다.
		// 필요에 의해서는 nextLine을 통해 문자열 입력 받도록 해야 한다.
		

	}

}
