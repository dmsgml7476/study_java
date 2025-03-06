package generic2;

public class Soju extends Alcohol {
	
	public Soju(String name, String cmp, int abv) {
		super(name, cmp, abv); // 부모쪽 생성자 메서드에 넘기겠다

	}
	
	@Override  // toStirng은 오버라이드 안의 클래스. 오버라이드가 가지고 있는 원형 그대로 사용.
	public String toString() {
		return "소주 : " +cmp+" , " + name + ", 도수"+abv+"%";
	}
	
	public void aa() {
		System.out.println("나는 소주다.");
	}

}
