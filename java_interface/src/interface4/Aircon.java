package interface4;

public class Aircon implements RemoteCon {

	@Override
	public void turnOn() {
		System.out.println("에어컨 켜짐");
	}

	@Override
	public void turnOff() {
		System.out.println("에어컨 꺼짐");
	}
//	public boolean onOff = false;
//
//	@Override
//	public void power() {
//		onOff = !onOff;
//		String text = onOff ? "ON" : "OFF";
//		System.out.println("에어컨의 전원 : "+ text) ;
//		
//	}

}
