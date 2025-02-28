package interface5;

public class MainMt {

	public static void main(String[] args) {
				
		//기능을 활용해줘야하니 CRUD 를 사용하여 다형성
		
		CRUD member = new MemberService();
		CRUD board = new MemberService();
		
		member.save();
//		
//		DBConnect mem = new MemberService ();
//		mem.save();  // 부모 클래스인 DBConnect 에는 save 메서드가 없다.

	}

}
