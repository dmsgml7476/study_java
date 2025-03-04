package exception4;

public class MainMt {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Member m1 = new Member();
		Member m2 = new Member("김유신", 25);
		
//		m1.nameCount();
		m2.nameCount();
		
		m1.getBirthYear();

	}

}


/*

		오류 발생이 예상되는 코드에 try{} catch() {} 를 넣어준다.
		오류는 대부분 입력, 계산, 인덱스, 참조변수활용 에서 많이 발생한다.
		이유=> 사용자조작과 밀접하기에
		
		try{} 에서 발생한 오류는 catch 로 넘어가게된다.
		catch 에서는 오류에 맞는 예외클래스를 사용토록 하는게 좋지만.
		어떤 오류가 발생할지 예상하기 어려운경우 부모클래스로 받는 것도 방법.
		
		try {
			코드1;
			코드2;
			코드3;
		} catch {예외 클래스   클래스 참조 변수) {}
			오류일 경우 사용자 알림 메시지
		}
		
		예외를 강제 발생 시키기 (오류발생)
		throw new 예외클래스 ("메시지"); // => 오류가 발생한 것을 사용자가 알 필요가 없으니 숨기기 위해
		주로 테스트에서 사용
		
		예외 던지기
		메서드 이름 뒤에 throws 예외 클래스
		어떤 객체에 의해 오류가 발생했는지 확인하고자 할 경우.
		메서드에서 예외 던지기를 한다.


*/