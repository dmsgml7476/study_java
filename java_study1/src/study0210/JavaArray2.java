package study0210;

import java.util.Scanner;

public class JavaArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
//		// 7개 정수를 저장할 수 있는 배열을 선언하고
//		// 정수 7개를 입력한뒤 모두 출력하세요.
//		
////		
////		int [] array = new int[7];
////		
////		for (int i=0; i<array.length; i++) {
////			System.out.print("정수를 입력하시오 : ");
////			array[i] = sc.nextInt();
////		}
////		
////		for (int i=0; i<array.length; i++) {
////			System.out.println("배열값 : " + array[i]); //0 번 인덱스부터 6번 인덱스까지
////		}
//		
//		int size=5;
//		
//		int[] age = new int[size]; // 변수를 이용해서 크기를 정하는 방식은 권장하지 않는다. 일부 상황에서 오류.
//		// 정적 배열은 지정된 크기를 변경하기 어렵다.
//		// 프로그램 실행시 컴파일 과정에서 배열의 크기가 정해져 있어야
//		// 그만큼 공간을 할당 받는데 배열의 크기가 확정되어 있지 않으면
//		// 컴파일 과정에서 공간을 할당 받지 못한다.
//		// (윈도우에 의해 필요한 만큼 대여 받는건데 정확한 크기가 없으면 대여안해줌)
//		age[0]=10;
//		System.out.println(age[0]);
//		
//	    // user ram / sys
//		
//		
//		int [] sum = new int[3];
//		int [] a= new int[] {30,20,};
//		int [] b= new int[] {1,5,9};
//		
//		// a배열과 b  배열의 합을 Sum 에 저장
//		
//		sum[0] = a[0] + b[0];
//		sum[1] = a[1] + b[1];
//		sum[2] = a[2] + b[2];
//		
//		for (int i=0; i<sum.length; i++) {
//			sum[i] = a[i] + b[i];
//		}
//		
//		// a와 b 배열의 데이터를 total 배열에 저장하기
//		// a배열의 값 먼저 저장하고 이어서 b 배열의 값 저장 될 수 있게!!
//					
//		// 저장한 뒤에 total 배열 값 출력
//		// 결과 -> 10 20 30 40 50 55 44 33 22 11
//					
//		int [] total = new int[10];
//		int [] a = new int[] {10,20,30,40,50};
//		int [] b = new int[] {55,44,33,22,11};
//		
////		
//		for (int i=0; i<a.length; i++) {
//			total[i] = a[i]	;				
//		}
//		
//		for (int i=0; i<b.length; i++) {
//			total[i+5] = b[i];					
//		}
//		
//		for (int i=0; i<a.length; i++) {
//			total[i] =a[i];
//			total[i+5] = b[i];
//			
//		}
//		for (int i=0; i<total.length; i++) {
//			System.out.println(total[i]);
//		}
//		
//		
//		char [] name = new char[5];
//		name[0] ='j';
//		name[1] ='o';
//		name[2] ='h';
//		name[3] ='n';
//		
//		
//		System.out.println(name);
//		
//		//name -> john 문자로 저장
//		// 문자열은 배열이지만 char 배열로는 
//		System.out.println("member".length());
//		
//		
//		
//		String myName = "john";
//		
//		System.out.println(myName);
//		
//		myName = "설경구";
//		System.out.println(myName.charAt(2));
//		
//		String youName = new String ("박문수");
//		System.out.println(youName);
//		
//		int[] a = new int[] {11,20,55};
//		int[] b = new int[] {13,20,55};
//		
//		boolean isSame = true; // 같은 배열이면 true, 다르면 false
//		
//		
//		for (int i=0; i<a.length; i++) {
//			if (a[i] != b[i])
//				isSame=false;
//		}
//		if (isSame) {
//			System.out.println("같은 배열");
//		} else {
//			System.out.println("다른 배열");
//		}
//		
//		char [] name1 = new char[] {'주', '동', '건'};
//	    char [] name2 = new char[] {'장', '동', '건'};
//	    
//	    
//	    // name1과 name2의 이름이 같은 이름인가??
//	    
//	    
//	    boolean isSame = true;
//	    
//	    for (int i=0; i<name1.length; i++) {
//	    	if (name1[i] != name2[i])
//	    		isSame=false;
//	    }
//		
//	    if (isSame) {
//	    	System.out.println("같은 배열");
//	    } else {
//	    	System.out.println("다른 배열");
//	    }
// 		
//		
//		
//		// 문자열 비교 -- 1. equals : 두 문자열이 일치하냐, 참이냐 트루냐
//		
//		
//		String name1 = "이동건";
//		String name2 = "장동건";
//		
//		if ( name1.equals(name2))
//			System.out.println("같은 이름");
//		else
//			System.out.println("다른 이름");
//		
//		// 문자열 비교 -- 2. compareTo => 같은 문자일경으 0 출력, 다르면 음수 또는 양수. 주 목적 정렬.
//		
//		System.out.println(name1.compareTo(name2));
//		// compareTo : 0 이라면 두 문자열이 동일
//		//       양수 : 사전적 순서가 앞일 경우 (name2)가 name1 보다 앞인경우
//		//       음수 : 사전적 순서가 뒤인 경우 (name2)가 name1 보다 뒤인경우
		
		
		// 오늘 과제가 있어요
		// 랜덤 범위 1~50
		// 랜덤 숫자 중에서 짝수 15개를 배열에 저장
		// 15개 전부 저장 되면 배열 출력하시요
		// 숫자 중복 상관없이
		
		
		int num=0;
		
		int [] arr = new int [15];
		
		
		
		while (true) {
			num = (int) (Math.random()*50+1);
			
			if (num%2==0) {
				for (int i=0; i <arr.length; i++)
					arr[i] = num;
			} else {}
			
			
		}
		
//        int [] num1 = new int [] {10,20,30,40,50,60,70,80,90,100};
//        
//        for (int a:num1) {
//        	System.out.println(a);
//        }
        
        
	}

}
