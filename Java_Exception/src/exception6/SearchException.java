package exception6;

public class SearchException extends Exception {
	// 커스텀 예외 처리
	
	private String errorCode;  // 예외(오류코드 번호)
	
	public SearchException(String message, String errorCode) {
		super(message);
		this.errorCode=errorCode;
	}
	
	public void keywordMis() {
		System.out.println("검색어 잘못 입력");
	}
}
