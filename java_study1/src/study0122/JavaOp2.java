package study0122;

public class JavaOp2 {

	public static void main(String[] args) {
		
		// 증감 연산자 ++, --
		
		int a = 10, b = 10, result = 0;
		
		// ++ 증가 연산자
		System.out.println("++ 전 : " + a);
		a++;
		//  a=a+1
		System.out.println("++ 후 : " + a);

		++a;
		System.out.println("++a : " + a);
		
		// 증감 연산자의 위치가 변수 앞, 변수 뒤 차이를 알아보자
		
		a=10;
		result = a++;  // 증가되기 전의 값 저장
		System.out.println("resutl = a++ : " + result);
		
		result = ++b;   // 증가된 후의 값 저장
		System.out.println("resutl = ++b : " + result);
		
		/* r= a++;
		 * r=a;
		 * a=a+1; 
		 *
		 * r= ++b;
		 * b=b+1;
		 * r=b;
		 * 
		 * 차이점 우선순위가 다르다. 변수에 넣어서 출력할 경우 우선 순위에 의해 증가되기 전/ 증가된 후의 값이 나오게 된다.
		 * 증감 연사자를 변수 앞에 붙이면 우선순위가 상위권
		 * 증감 연사자를 변수 뒤에 붙이면 우선순위가 하위권 
		 */
		 
	}

}
