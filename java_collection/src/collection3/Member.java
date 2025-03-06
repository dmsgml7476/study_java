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
public class Member {  // 회원 정보 저장
	private Long id; // 회원 번호	
	private String memberId; // 회원 아이디
	private String email; // 회원 이메일
	private String password; // 회원 비밀번호
	private String birth; // 생년월일(8자리)
	
//	public Member() {}
//	public Member(Long id, String memberId, String email, String password, String birth) {
//		this.id=id;
//		this.birth=birth;
//		this.email=email;
//		this.memberId=memberId;
//		this.password=password;
//	}
	
	
	// get/set 메서드
	
//	MemberDao mDao = new MemberDao();  // 데이터베이스 접근 클래스를 Dao
	

	
}





// 클래스 정의
// 		인스턴스변수의 접근 제어자는 private
//		인스턴스변수에 대해 get, set 메서드
//		toString 메서드 만들기





