package innerTest;

public class MainMethod {

	public static void main(String[] args) {
		// 상속 관계와 포함관계
		//   사람     개발자     (상속관계)
		//   직업     개발자     (상속관계)
		
		// 필기도구   볼펜   (상속관계)
		
		// 자전거   체인   (포함관계)
		Tire tire = new Tire();
		tire.setInch( 18 );
		
		Car car = new Car( tire );
		
		System.out.println( car.getTire().getInch() );

	}

}
