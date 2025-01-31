package study0123;

public class JavaBitOp {

	public static void main(String[] args) {
		// 비트 논리 연산자 (2진수)
		
		System.out.println(27 & 13); // and 연산 (곱하기, 0이 하나라도 있으면 0 1 - 1 은 1)
		System.out.println(27 | 13); // or 연산 (1이 하나라도 있으면 1 없으면 0)
		System.out.println(27 ^ 13); // xor 연산 (같은 것끼리(1-1, 0-0)면 0, 다른 것들끼리 연산하면(1-0) 0)
		System.out.println( ~13 ); // not 연산 0 -> 1, 1->0 , 부호비트 + <-> -, 부호비트가 음수일 경우 1의 보수를 취했다.
		
		//비트 쉬프트 연선자
		System.out.println(21 << 2); // 시프트 연산자;

		
	}

}



