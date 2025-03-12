package Control;

import java.util.Scanner;

import Service.ActiveService;
import Service.MemberService;
import Service.SchoolService;


public class MyMain {
	private static Scanner sc = new Scanner(System.in);
	private static int menu() {
		System.out.println("========메뉴========");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		return num;
	}
	
	public static int subMenu(SchoolService schoolService, String id) {
		System.out.println("\n==== 아이러브스쿨 =====\n");
		System.out.println("1. 학교찾기");
		System.out.println("2. 동창회");
		System.out.println("3. 소모임");
		System.out.println("4. 종료");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		
		if (num == 1) {
			schoolService.searchSchool(id);
		} else if(num==2) {
			schoolService.myReunion();
		} else if(num==3) {
			schoolService.smallGather();
		} else {
			return 0;
		}
		return subMenu(schoolService, id);  // 재귀호출 : 자기가 자기를 실행시키는 것.
	}
	
	
	public static void main(String[] args) {
		
		// 서비스 클래스들을 통해 로그인과 학교 찾기를 할것이다.
		
		MemberService memberService = new MemberService();
		SchoolService schoolService = new SchoolService();
		
		// 메뉴
		
		while(true) {
			switch (menu()) {
			case 1 : // 로그인
				String id = memberService.signIn();
				if (id!=null) { // 로그인 성공
					subMenu(schoolService, id);
					return;
				} else //로그인 실패
					System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
				break;
			case 2 : // 회원가입
				memberService.signUp(	);
				break;
			case 3 : // 종료
				return;
			default:
				System.out.println("잘못 선택했습니다.");
			}
			
		}

	}
	

}


/*

int fac(int a) {
	return a * fac(a-1);
}

fac(5)  1번째 메서드
	a -> 5
	return 5 * fac(5-1);
	
		fac(4) 2번째 메서드
		  a -> 4
		  return 4 * fac(4-1)
		  
		  	fac(3)  3번째 메서드
		  	  a->3
		  	  return 3* fac(3-1); 
		  	  a-> 2
		  		fac(2)  4번째 메서드
		  	      a->2
		  	      return 2* fac(2-1);  5번째
		  	      a-> 1
		  	      return 1;
		  	    
float aa(int b) {
	if(b>5) 
		aa(b-1)
	return b/2.0;
}

aa(6);


int i = 7;
for (; i>5; i--);

int sum=0
for(int i=1; i<=5; i++) {
	sum = sum+i;
}
System.out.println(sum);

int sum(int a) {
	if(a==1) return 1;
	return a + sun(a-1);
}


System.out.println(sum(5));

*/



