package study0220;

public class Member {
	String userId;  // 아이디
	String password; // 비밀번호
	long id; // 회원번호
	
	Member(){}
	Member(String userId, String password, long id) {
		this.userId=userId;
		this.password=password;
		this.id=id;
	}
	public String toString() {
		return "아이디 : " + this.userId + " 비밀번호 : " + this.password + "회원번호 : " + this.id;
	}
	
	
	void output() {
		System.out.println("아이디 : " + this.userId + " 비밀번호 : " + this.password + "회원번호 : " + this.id);
	} // 내가 가지고 있는 데이터를 이용하기에 매개변수 필요없음
}
