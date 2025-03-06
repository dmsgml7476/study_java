package collection3;

import java.util.ArrayList;

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
		
		ArrayList<Member> memberList = dao.select();
		for (Member m: memberList) {
			System.out.println(m);
		}

	}

}
