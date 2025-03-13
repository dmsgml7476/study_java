package thread2;

public class Barista implements Runnable {
	public final Cafe cafe; // 바리스타가 일하는 카페
	
	
	public Barista (Cafe cafe) { // 바리스타가 일하는 카페를 넣어줘야 주문을 받지!
		this.cafe = cafe;
	}
	
	
	@Override
	public void run() {
		try {
			while(true) {
				Order order = cafe.give();
				System.out.println("바리스타 제조 : " + order.getOrderId() + " - " + order.getMenu());
					Thread.sleep(3000);  // 그냥 주문 시간 설정만 한거 nullpointer 와 상관 없음
					System.out.println("바리스타 제조 완료 : " + order.getMenu());
			}
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}

}
// 클래스 내부 변수 초기화 방법 : 명시적 초기화, 초기화 블록, 생성자 메서드를 통해 초기화