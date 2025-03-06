package generic2;

public class Service {
	
	public void drink(Bottle<? extends Alcohol> soju) {//알코올 섭취
		
		System.out.println(soju.item);
		System.out.println("한 잔 마신다");
		
	}
	
//	public void drink(Bottle<Makgeolli> mak) {//오버로딩 안됨. 타입이 같은 취급.
//		
//		System.out.println(Makgeolli.item);
//		System.out.println("한 잔 마신다");
//		
//	}

}
