package study0214;

import java.util.Scanner;

public class JavaTest1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		
//		// 문제 1
//		// 학생 5명의 시험 성적을 키보드를 통해 입력받구
//		// 평균 점수를 구하여 출력하세요.
//		// 반드시 시험 성적은 배열에 저장!!!!!!
//		
//		
//		int[] arr = new int[5];
//		
//		
//		
//		for (int i=0; i<arr.length; i++) {
//			System.out.print((i+1) + "교시 시험 성적을 입력 : ");
//			int grade = scan.nextInt();
//			
//			arr[i] = grade;
//		}
//		
//		int sum = 0, avg=0;
//		
//		for (int i=0; i<arr.length; i++) {
//			sum += arr[i];
//			avg = sum/arr.length;
//		}
//		
//		System.out.println("시험 결과 평균 성적 : " + avg);
//		
//		
////================================================================================
////		
////		
////		
//		// 문제 2. 
//		
//		// 알파벳 문자 하나를 입력하세요.
//		// 입력한 알파벳으로 시작하는 단어를 모두 찾아 출력하세요.
//		// 그리고 출력한 단어가 총 몇개인지 출력하세요.
//		    // 힌트 : chatAt(인덱스)
//		
//		String[] word = new String[] {
//				"apple", "banana", "cherry", "date", "elderberry", 
//	            "fig", "grape", "honeydew", "kiwi", "lemon", 
//	            "mango", "nectarine", "orange", "papaya", "quince", 
//	            "raspberry", "strawberry", "tangerine", "ugli", "vanilla", 
//	            "watermelon", "xigua", "yam", "zucchini", "avocado", 
//	            "blueberry", "cantaloupe", "dragonfruit", "apricot", "blackberry", 
//	            "coconut", "dragonfruit", "eggplant", "feijoa", "grapefruit", 
//	            "huckleberry", "iceplant", "jackfruit", "kiwifruit", "lime", 
//	            "mangosteen", "nectar", "orange", "peach", "pineapple", 
//	            "pear", "plum", "pomegranate", "pear", "lime", 
//	            "apricot", "banana", "papaya", "melon", "peach", 
//	            "plum", "raspberry", "blueberry", "citrus", "mango", 
//	            "blackcurrant", "cucumber", "fennel", "grape", "strawberry", 
//	            "apricot", "blackberry", "currant", "kiwi", "orange", 
//	            "lemon", "watermelon", "melon", "tangerine", "apple", 
//	            "date", "elderberry", "fruit", "peach", "fruit", 
//	            "apple", "cherry", "fig", "honeydew", "jackfruit", 
//	            "papaya", "blueberry", "plum", "pomegranate", "grape", 
//	            "avocado", "kiwi", "lemon", "watermelon", "tangerine", 
//	            "strawberry", "dragonfruit", "lime", "pear", "peach"
//		};
//		System.out.print("알파벳을 입력하세요 : ");
//		char abc = scan.nextLine().toLowerCase().charAt(0);
//		
//		
//		// 알파벳을 무조건 소문자로 변환 toLowerCase
//		
//		
//
//		int total=0;
//		
//		for (String str : word) {
//			if (str.charAt(0) == abc) {
//				System.out.println(str); total++;
//			}
//		}
//		
//
//		
//=======================================================================
		
		// 문제3.
		/* 
		
		영화관 예약 사이트를 만들려고 한다.
		영화관에 관별로 좌석수가 다르다.
		3관의 좌석수는 96개다.
		
		좌석에 예약완료 된 곳은 1로 표시
		비어있는 좌석은 0으로 표시
		
		몇명 예약할것인지 인원수를 입력하면
		연속적으로 비어있는 자리로 지정해준다.
		몇번째 좌석에 예약이 되었는지 출력
		
		 */
		
		int[][] seat = new int[8][12];
		int num = 0;
		
		
		for (int i = 0; i<seat.length; i++) {
			for (int k=0; k<seat[i].length; k++) {
				seat[i][k] = num;
				num=(int)(Math.random()*2);
				System.out.print(seat[i][k]);
			}
			System.out.println();
		}
		
		System.out.print("예약 좌석 수 : ");
		int ticket = scan.nextInt();
		int count=0, x=0, y=0;


		for (int i = 0; i<seat.length; i++) {
			for (int k=0; k<seat[i].length; k++) {
				if (seat[i][k] == 0) {
					count++;
  				    System.out.println(count);
					
				}
				if (seat[i][k] == 1) {
					count=0;
				}
			}
			
		}
	

	}

}
