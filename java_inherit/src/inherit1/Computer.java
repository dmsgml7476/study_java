package inherit1;

public class Computer extends Product{

	public Computer() {}
	public Computer(String brand, int price, String name ) {
	super(brand, price, name);

	
}
	@Override
	public void power() {
		onOff = !onOff;
		System.out.println("컴퓨터 전원 : " + onOff);
	}


}
