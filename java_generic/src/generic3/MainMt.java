package generic3;

public class MainMt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		포스틱 ps1 = new 포스틱("포스틱", 4000);
		포스틱 ps2 = new 포스틱("포스틱", 4500);
		
		예감 yg = new 예감("예감", 3000);
		
		매운새우깡 ms1 = new 매운새우깡("매새깡", 3500);
		매운새우깡 ms2 = new 매운새우깡("매새깡", 4000);
		
		SnackBox<포스틱> 박스1 = new SnackBox<>();
		박스1.makeBox(ps1);
		
		SnackBox<포스틱> 박스2 = new SnackBox<>();
		박스2.makeBox(ps2);

		
		Snack[] 과자배열 = new Snack[] {
				new 예감("예감",1300), new 매운새우깡("매새깡",1400),
				new 매운새우깡("매새깡",1500)
		};
		
		
		SnackBox<Snack> 박스3 = new SnackBox<>();
		박스3.makeBox( 과자배열[0] );
		SnackBox<Snack> 박스4 = new SnackBox<>();
		박스4.makeBox( 과자배열[1] );
		SnackBox<Snack> 박스5 = new SnackBox<>();
		박스5.makeBox( 과자배열[2] );
		
//		SnackBox<예감> 박스3 = new SnackBox<>();
//		박스3.makeBox(yg);
//	
//		System.out.println();
//		
//		SnackBox<매운새우깡> 박스4 = new SnackBox<>();
//		박스4.makeBox(ms1);
//		
//		SnackBox<매운새우깡> 박스5 = new SnackBox<>();
//		박스5.makeBox(ms2);
		
//		Snack 포스틱3 = new 포스틱("포스틱", 1700);
//		
//		ps1.snackName = "쓰리스틱";
//		ps1.price = 5000;
//		
//		
//		박스1.test();
//		박스2.test();
//		
		
		
//		
//		SnackBox<포스틱> 박스6 = new SnackBox<>();
////		박스6.makeBox(포스틱3);   // 부모 클래스를 자식 클래스로 넣으려 하는 격. 강제 형변환이 필요
//		박스6.makeBox((포스틱)포스틱3);
//		
		//or
		
//		SnackBox<Snack> 박스6 = new SnackBox<>();
//		박스6.makeBox(포스틱3);

	}


}


// 제너럴 타입으로 배열을 만들 수 없음.
