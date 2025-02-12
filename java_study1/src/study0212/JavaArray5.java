package study0212;

public class JavaArray5 {

	public static void main(String[] args) {
		
		// 1차원 배열 : 같은 타입의 변수가 연속적으로 이루어진 구조
		// 2차원 배열 : 같은 타입의 1차원 배열이 여러개로 이루어진 구조

		int q =10, as=20, gf=232;
		
		int [] a = new int[] {3,4,5}; //1차원 배열 - 3의 크기
		int [] b = new int[] {1,20,60}; //1차원 배열 - 3의 크기
		int [] c = new int[] {23,98,54}; //1차원 배열 - 3의 크기
		// A반 학생의 성적 -> 1차원 배열
		// 1학년 전체 학생성적 -> 2차원 배열
		
		//int[][] abc=new int[2][3];
		//int[][] abc= new int [1,3][3,4];

		
		int[][] abc = new int [][] {a, b, c};
		
		System.out.println(abc[0][0]);
		System.out.println();
		
		int[][] arr = new int [3][4];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 500;
		arr[1][3] = 100;
		arr[2][1] = 10;

		
		for (int i=0; i<arr.length; i++) {
			for (int k=0; k<4; k++) {
				System.out.println(arr[i][k]);
			}
			
		}
		
		// 1차원 배열 -> 향상된 for 문 : for(int a: array) {}
		
		for (int i=0; i<arr.length; i++) {
			for (int num : arr[i]) {
				System.out.println(num);
			}
		}
			
		
		for (int[] tmp: arr) {
			for (int num: tmp);
		}
		

	}

}

// 2차원 배열 -> 3차원배열 -> 문자열 ->
// 배열 실습문제 풀기(2~3문제 1차원 1~2개, 2차원 1개)
// 문제 풀기 할때 전체 인원중 70%가 안되면 쉬운 문제(그래도 이정도는 해야지)
// 2문제 해보고 그래도 안되면 다시 1차원 배열 수업

