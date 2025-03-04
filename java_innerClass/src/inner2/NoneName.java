package inner2;

public class NoneName {
	Object ob=new Object() {
		public int hashCode(int a) {
			
			return 10;
		}
		
	};   // 익명 클래스 정의 와 메서드 정의를 동시에 하면서 객체 생성
	
	void myInner() {
		
	}
}

// 익명 내부 클래스 = 임시 사용. 거의 일회용.
