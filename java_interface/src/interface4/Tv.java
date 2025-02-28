package interface4;

public class Tv implements RemoteCon {

	@Override
	public void turnOn() {
		System.out.println("Tv 켜짐");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Tv 꺼짐");
	}
//	public boolean onOff = false;
//	@Override
//	public void power() {
//		onOff = !onOff;
//		String text = onOff ? "ON" : "OFF";
//		System.out.println("TV의 전원 : "+ text) ;
//		
//	}

}
