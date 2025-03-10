package DAO;

public class MemberDAO extends DBconnect {

	public boolean userIdAndPassword(String mId, String mPw) {
		// 입력한 아이디와 비밀번호로 테이블 조회하기
		
		String sql = "select * from member1 where member_id='"+mId+"'"; // 작은 따옴표는 필수
		return false;
	}

}
