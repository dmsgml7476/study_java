package collection3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
//import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor    // 기본생성자메서드 만드는 거
//@RequiredArgsConstructor  // 필수변수 들어간 기본 생성자 만듬 필수변수를 표시 안하면 기본생성자를 만들어서 위에거랑 겹쳐서 오류뚬
@AllArgsConstructor   //모든 인스턴스 매개변수로
public class Member implements Comparable<Member> {  // 회원 정보 저장
	private Long id; // 회원 번호	
	private String memberId; // 회원 아이디
	private String email; // 회원 이메일
	private String password; // 회원 비밀번호
	private String birth; // 생년월일(8자리)
	private int age; // 나이
	
//	public Member() {}
//	public Member(Long id, String memberId, String email, String password, String birth) {
//		this.id=id;
//		this.birth=birth;
//		this.email=email;
//		this.memberId=memberId;
//		this.password=password;
//	}
	
	
	// get/set 메서드
	
//	 
	
	// 컬렉션에서 contains, indexOf 와 같은 비교 동작 메서드
	// 사용하려면 사용자 정의 클래스에서는 equals 를 구현 해야 한다.
	
//	@Override
//	public boolean equals(Object obj) {
//		Member temp = (Member)obj;
//		return this.email.equals(temp.email);
//		
//	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Member temp = (Member)obj;
//		return this.birth.equals(temp.birth);
//	}
	
//	@Override
//	public boolean equals (Object obj) {
//
//		Member temp = (Member)obj;
//		return this.birth.equals(temp.birth)&&this.email.equals(temp.email)&&this.memberId.equals(temp.memberId);
//	}
	
	@Override
	public boolean equals(Object obj) {
		Member temp = (Member)obj;
		boolean isSame=this.birth.equals(temp.birth);
		isSame = isSame && (this.email.equals(temp.email));
		isSame = isSame && (this.memberId.equals(temp.memberId));
		return isSame;
	}
	
	@Override
	public int compareTo(Member o) {
		// 정렬을 위한 compareTo 메서드 구현
		// 정렬의 기준을 설립한다.
		
		
//		return this.age-o.age;
		return this.birth.compareTo(o.birth)*-1;
		// return o.birth.comparTo(this.birth);
	}
	
	
}





// 클래스 정의
// 		인스턴스변수의 접근 제어자는 private
//		인스턴스변수에 대해 get, set 메서드
//		toString 메서드 만들기





