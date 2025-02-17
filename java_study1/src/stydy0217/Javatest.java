package stydy0217;

import java.util.Arrays;
import java.util.Scanner;

public class Javatest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
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
//		
//		int[][] seat = new int[8][12];
//		int num = 0;
//		
//		
//		for (int i = 0; i<seat.length; i++) {
//			for (int k=0; k<seat[i].length; k++) {
//				seat[i][k] = num;
//				num=(int)(Math.random()*2);
//				System.out.print(seat[i][k]);
//			}
//			System.out.println();
//		}
//		
//		System.out.print("예약 좌석 수 : ");
//		int ticket = scan.nextInt();
//		int count=0, x=0, y=0;
//


//// ==================================================================================
//		
//		/*
//		  
//		 문제4
//		 도서관의 관리자로 대출한 사람들의 기록을 관리하고 있다.
//		 도서관에서 여러사람들이 책을 대출하며 각 사람은 여러권의 책을 대출할 수 있다.
//		 
//		 각 사람이 대출한 책의 제목을 배열로 저장하고 그 사람의
//		 대출 내역을 출력하는 프로그램을 작성하시오.
//		 
//		 조건. 
//		   - 도서관에는 3명의 이용자가 있고 최대 5권까지 대출
//		   - 각 이용자의 이름과 대출한 책 제목을 출력
//		 
//		 # 이용자의 이름과 책 제목은 키보드를 통해 입력해도 되고
//		 배열 선언시 초기값 지정해도 되고~~~
//		 
//		  
//		 */
//		String [][] users = new String [][] {
//			{"책1", "책2", "책3", "책4", "책5"},
//			{"책2", "책3", "책6", "책7"},
//			{"책2", "책8"}
//		};
//	
//		
//		for (String[] info : users) {
//			for (String tmp : info) {
//				System.out.print(tmp);
//			}
//			System.out.println();
//		}
//		
//		
//		
//		
//		
//// ==================================================================================
		
		/*
		
		문제
		농장수확량 계산
		농장의 일일 수확량을 배열에 저장했다.
		전체 수확량을 구하고, 평균수확량을 구하시오.
		가장 많은 수확량은 얼마인지 출력 - 힌트 : ㅈㄹ
		
		*/
		int sum = 0, avg = 0;
		int[] harvest = {9, 10, 11, 8, 7, 5};
		
//		for (int i = 0; i<harvest.length; i++) {
//			sum += harvest[i];
//			avg = sum/harvest.length;
//		}
		
		for (int am : harvest) {
			sum += am;
		}
		
		avg=sum/harvest.length;
		
		System.out.println("전체 수확량 : " + sum);
		System.out.println("평균 수확량 : " + avg);
		
		Arrays.sort(harvest);
//		System.out.println(Arrays.toString(harvest));
		System.out.println("가장 많은 수확량 : " + harvest[harvest.length-1]);
		
		
		
		

		
		
		
	}

}
