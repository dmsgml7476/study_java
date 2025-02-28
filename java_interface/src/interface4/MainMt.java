package interface4;

public class MainMt {

	public static void main(String[] args) {

		RemoteCon[] rcon= new RemoteCon[] {
				new Light(), new Tv(),
				new Aircon()
		};
		
		for (RemoteCon con : rcon) {
			con.turnOn();
			con.turnOff();
		}
		
		
//		RemoteCon air = new Aircon();
//		RemoteCon lig = new Light();
//		RemoteCon tv = new Tv();
	
//		
//		air.power();
//		
//		tv.power();
//		tv.power();
//		
//		lig.power();
//		lig.power();

	}

}

