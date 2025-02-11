package study0211;

import java.util.Arrays;
import java.util.Collections;

public class JavaArray3 {

	public static void main(String[] args) {
//		int [] number = new int [] {10,20,30,44,55,66,100,2323};
//		
//		for (int num : number) {
//			System.out.println(num);
//		}
//		
//		// 배열의 인덱스 사용 불가 (순차적으로 꺼내올 뿐, 꺼내온데이터 값의 인덱스 위치를 알지는 못함.)
//		// 배열의 데이터를 변경하거나 삭제 불가. num을 변경해도 배열의 값은 변경되지 않음.
//		
//		// 문제 
//		// tall 배열은 A반 학생들의 키를 저장한 것이다.
//		// A반의 평균 이상 키를 찾아서 출력하세요.
//		
//		
//		//============= 내 풀이 ========================
//		
//		float [] tall = new float [] {
//				167.2f, 163.4f, 175.7f, 173.8f, 158.3f
//		};
//		
//		float sum=0, avg=0;
//		
//		for (int i = 0; i<tall.length; i++) {
//			sum +=tall[i];
//			avg = sum/tall.length;}
//		
//		for (int i = 0; i<tall.length; i++) {
//			
//			if (tall[i] >= avg) {
//				System.out.println(tall[i]);
//			}
//		}
//		
//		// ==========교수님풀이=======================
//		
//		for (float t : tall) {
//			sum = sum + t;  // 총합 구하기
//		}
//		avg = sum/tall.length; // 평균구하기
//				
//		for (float t : tall) {
//			if (avg <= t)
//				System.out.println(t);
//		}
//		
//		//============문제끝=================
		
		
		
		int [] num = new int[] {10, 20, 30, 40, 50, 60,70};
		
		System.out.println(Arrays.toString(num));
		// 자바에서 데이터 출력 메서드이름은 toString
		// Arrays.toString(num));
		
		int [] a = new int[7];
		System.out.println(Arrays.toString(a));
		
		
		// 배열 복사
		// arraycopy (복사 배열, 복사배열시작인 덱스, 저장배열, 저장시작인덱스, 크기);
		System.arraycopy(num, 0, a, 0, num.length);
		System.out.println(Arrays.toString(a));
		
		// 배열 비교
		boolean isSame = Arrays.equals(num, a);
		System.out.println(isSame);
		
		// 배열 정렬
	    int [] arr = new int [] {575,48,29,14,7,2315, 72,90,123};
	    System.out.println("==== 정렬전 ===");
	    System.out.println(Arrays.toString(arr));
		
	    Arrays.sort(arr);  // 기본 정렬 오름차순.
	    System.out.println("=== 정렬후 ===");
	    System.out.println(Arrays.toString(arr));
	    
	    
	    // 내림차순 정렬.
	    
//	    Arrays.sort(arr, Collections.reverseOrder());  // 내림차순 정렬.
	    // comparator 구현 필요.
		
	    // 클래스로 정의된 정렬은 내림차순 comparator 구현 없이도 가능.
	    Integer[] arr2 = {5,4,1,2,3};    
	    Arrays.sort(arr2, Collections.reverseOrder());  // 내림차순 정렬.
	    // comparator 구현 필요.
	    
	   
	    String [] names = {"이순신", "이성계", "김춘추", "정약용", "문익점"};
	    System.out.println(Arrays.toString(names));
	    
	    Arrays.sort(names); // 오름차순 정렬
	    System.out.println(Arrays.toString(names));
	    
	    Arrays.sort(names, Collections.reverseOrder());  // 내림차순 정렬
	    System.out.println(Arrays.toString(names));
	    
	    
	    
		
		
		
		
		
  
	}

}
