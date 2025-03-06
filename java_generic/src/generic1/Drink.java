package generic1;

public class Drink<T, W> {   // generic 타입 사용법! 여러개 사용 가능. 많으면 많을 수록 코드의 복잡성 증가.
	T name;
	int ml;
	
	public void 경림추천(T name) {
		this.name= name;
		System.out.println(this.name);
	}
}
