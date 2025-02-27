package testMain;



public class Cir extends Figure { // 원

		public Cir(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

		@Override
		public void draw() {
			 System.out.println("지름이 " + width + " 인 원을 그린다.");
			
		}



}
