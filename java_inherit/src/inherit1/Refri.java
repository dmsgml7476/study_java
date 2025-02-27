package inherit1;

public /*abstract*/ class Refri extends Product { // 냉장고

	
	@Override
	public void power() {  // 부모 클래스에 있는 추상메서드를 구현하거나, 추상클래스로 만들어주거나.
		onOff = !onOff;
		System.out.println("냉장 전원 : " + onOff);
	}

}

// 부모 클래스가 추상메서드를 가지고 있는 추상 클래스라면 자식클래스에게 추상메서드를 상속시키기 때문에
// 자식 클래스는 추상메서드를 가지고 있는 것과 마찬가지가 된다.