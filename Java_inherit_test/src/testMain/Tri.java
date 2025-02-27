package testMain;

public class Tri extends Figure { // 삼각
	
	
	public Tri(int width, int height) {
		super(width,height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		 System.out.println("지름이 " + width + " 인 삼각형을 그린다.");
		
	}

}
