package collection3;

import java.util.ArrayList;
import java.util.Collections;

public class MainMt {

	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		// 생성자 메서드를 만들지 않고 제작시, 아래와같이 하나하나 다 넣어줘야한다.
//		list.add(new Member());
//		list.get(0).setEmail("dslkgj");
//		list.get(0).setBirth("24444");
//		list.get(0).setMemberId("dhfsjkag");
//		list.add(new Member(1l, "jkr","jkr@naver.com", "1234", "19990101"));
//		list.add(new Member(2l, "dw","dw@naver.com", "1234", "19981010"));
//
//		System.out.println(list);

		MemberDao dao = new MemberDao();  // 데이터베이스 접근 클래스를 Dao
		
		ArrayList<Member> memberList = dao.select();  // 기존에 ArrayList 는 자바 내에서 데이터 입력하고 자바 내에서 만들어줬다.
		                                              // 근데 이번에는 디비버를 사용해서 외부에서 불러왔다(?)
													  // ArrayList의 내장 메서드 사용불가.
		for (Member m: memberList) {
			System.out.println(m);
		}
		
		// 이메일로 아이디와 비밀번호 조회하기!!


		String email = "brown@gmail.com";
		
		for (Member mem:memberList) {
			if (mem.getEmail().equals(email))
				System.out.println(mem.getMemberId());
				System.out.println(mem.getPassword());
				break;
		}
		
//		System.out.println(memberList.get(0).equals(email));
//		// equals의 값이 곧 contains의 결과값은 아니다. equals의 결과값을 contains가 이용할뿐
//		System.out.println(memberList.contains(email));
		

		/* contains 메서드 실행(memberList.contains(대상)) -> 반복문 실행.
		타입에 대해서도 비교하기 때문에 동일한 타입으로 비교할 수 있게!!!
		email은 String 클래스 타입이라 안된다. 그래서 Memeber 클래스 객체에 email을 담아서
		비교하게 된다.
		contains 는 아래를 보면 알수있듯이 equals를 사용한다. 하지만 ArrayList에 기본 타입이 아닌 Member
		타입을 사용했기 때문에 기본으로 들어가 있는 equals메소드가 존재하지 않는다. 그래서 Member에 equals메서드를
		만들어준다.
		*/
		
		Member 대상 = new Member();
		대상.setEmail(email);
		
//		for (int i=0; i<memberList.size()-1; i++) {
//			
//			Member cmp = memberList.get(i);
//			
//			if(cmp.equals(대상)) {
//				System.out.println("찾았다");
//			}
//			
//		}
//		System.out.println(memberList.contains(대상));
		
		// memberList에 등록된 사람들중
		// 장은호 생년월일과 같은 회원이 있나?
		
		System.out.println("==================장은호 생년월일과 같은 사람 찾기=================");
		
		Member 장은호 = new Member();
		장은호.setBirth("19970818");
		장은호.setEmail("babo@daum.net");
		장은호.setMemberId("kkk1");
		
		
		System.out.println(memberList.contains(장은호));
		System.out.println(memberList.indexOf(장은호));
		
		
		// 정렬 적용하기 (equals와
		
		
		System.out.println( "apple".compareTo("bag"));  // 앞에보다 뒤에가 크면 음수, 앞이 뒤에보다 크면 양수
		Collections.sort(memberList);
		System.out.println(memberList);
		for (Member m:memberList) {
			System.out.println(m.getId()+" "+m.getBirth()+ " " + m.getAge());
		}
	
	}

}
