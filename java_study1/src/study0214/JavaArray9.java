package study0214;

public class JavaArray9 {

	public static void main(String[] args) {
//		//String str = "member";  // String str = new String("member")
//		
//		//System.out.println(str.charAt(0));
//		
//		String str = new String("member"); // 객체의 공간
//		char[] c = {'a'};  // 배열의 공간
//		c[0] ='a';
//		
//		String [] names = new String[5];   //배열의 공간
//		names[0] = new String("박문수");
//		names[1] = "김정호";
//		names[2] = "서경림";
//		names[3] = "김면준";
//		names[4] = "이정훈";
//
//		
////		
////		boolean hasName = false;
////		
////		for (String name : names) {
////			if (name.equals("김미란"))
////				hasName=true;
////		}
////		if(hasName) System.out.println("이름 등록 됨");
////		else System.out.println("등록 되지 않은 이름");
//		
//		// 어제 했던 메서드중에
//		
//		//배열->문자열
//		
//		String tmep = String.join(",", names);
//		
//		boolean hasName = tmep.contains("서경림");
//		
//		if(hasName) System.out.println("이름 등록 됨");
//		else System.out.println("등록 되지 않은 이름");
		
		
		
		// 학과명 , 조교, 전화, 위치
		
		String[][] dept = new String[4][];
		
		dept[0] = new String [] {"컴퓨터공학과", "정보과학과", "정보통신공학과", "정보산업공학과", "전자공학과", "문헌정보학과", "전기공학과"};
		
		dept[1] = new String [] {"이지은", "김영미", "박순애","이미선","이춘애","김기범", "박준용"};
		
		dept[2] = new String [] {"3333","3334","3335","3336", "3337","3338","3339"};	
		
		dept[3] = new String [] {"T101","T201","T301","T401","T501","T601","T701",};
		
		
		// 정보통신공학과의 과사무실 위치와 조교이름
		
		
		String search="정보통신공학과";
		int idx=-1;

		for (int k=0; k<dept[0].length; k++) {
			if (dept[0][k].equals(search)) {
					idx=k; break;
			}
		}
		
		if (idx == -1) // 만약 학과가 존재하지 않으면
		{System.out.println("등록 되지 않은 학과입니다.");
			return; // return은 메서드를 종료 시킨다. main 메서드 종료되면 프로그램 끝.
		}
		
		System.out.println("조교 : "  + dept[1][idx] + ", 사무실 : " + dept[3][idx]);
		
 		

	}

}
