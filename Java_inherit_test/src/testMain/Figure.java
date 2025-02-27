package testMain;

public abstract class Figure {  // 도형
	
	protected int width;
	protected int height;

	public Figure() {};
	public Figure(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public abstract void draw();
	

}
