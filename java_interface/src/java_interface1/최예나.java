package java_interface1;

public class 최예나 implements /*Move, Attack,*/ Active{

	@Override
	public void moving() {
		System.out.println("예나가 360도로 회전하며 옆으로 간다.");
		
	}

	@Override
	public void target() {
		System.out.println("예나가 경림이를 노려보았다.");
		
	}

}
