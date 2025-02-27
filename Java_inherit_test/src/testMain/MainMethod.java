package testMain;

public class MainMethod {

	public static void main(String[] args) {
		
		
		Cir cir = new Cir (30, 30);
		Quadra quadra = new Quadra(20, 20);
		Tri tri = new Tri(10, 10);

		cir.draw();
		tri.draw();
		quadra.draw();
	}

}
