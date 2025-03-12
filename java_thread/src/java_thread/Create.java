package java_thread;

public class Create extends Thread {
	
	public static Dino egg = null;
	public static void hatch(Dino dino) {
		egg = dino;
	};
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(50);
			} catch (Exception e) {}
			
			if (egg != null) { // 클래스변수에 값이 입력된걸 감지 하면  부화시작하기
				System.out.println(egg.getName() + "부화 시작!");
				try {
					Thread.sleep(egg.getTime()*1000);
				} catch (Exception e) {}
				System.out.println(egg.getName() + " 공룡 태어남");
					egg=null; // sleep의 지정한 시간이 종료 되면 다시 클래스변수를 비워줘야 한다. 그래야 다음 공룡 부화를 제대로 해줄수 있다. 안그러면  egg의 값이 변해서  다른 공룡이 태어나게 된다. (그러면안되.. 내가 컵에 물 따라서 마시고 있는데 친구가 와서 주스 먹고싶다고내가 마시는 컵에 주스를 따라 버리는 경우가 되버리니까 -물도 마시고 싶고 주스도 마시고 싶었는데 마침 친구가 주스를 따라줘서 럭키비키잖아 ) 
			}
		}
	}

}
