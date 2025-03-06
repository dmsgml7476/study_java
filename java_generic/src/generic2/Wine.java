package generic2;

public class Wine extends Alcohol {
	
	public Wine(String name, String cmp, int abv) {
		super(name, cmp, abv);

	}
	
	@Override  // toStirng은 오버라이드 안의 클래스. 오버라이드가 가지고 있는 원형 그대로 사용.
	public String toString() {
		return "와인 : " +cmp+" , " + name + ", 도수"+abv+"%";
	}

}
