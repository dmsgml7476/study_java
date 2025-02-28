package interface4;

public class Light implements RemoteCon {

	@Override
	public void turnOn() {
		System.out.println("전구 켜짐");	
	}

	@Override
	public void turnOff() {
		System.out.println("전구 꺼짐");
	}
//	public boolean onOff = false;
//	
//	
//	@Override
//	public void power() {
//		onOff = !onOff;
//		String text = onOff ? "ON" : "OFF";
//		System.out.println("전등의 전원 : "+ text) ;
//		
//	}

}
