package thread2;

public class MainMt {

	public static void main(String[] args) {
		
//		Thread c1 = new Thread(new Customer()); // 스레드 객체 생성
//		c1.start(); // 스레드 시작
//		
//		// Customer c1 = new Customer(); 로 선언한 후 객체 생성하고 .start()와 같은 내장메서드를 실행하려면 오류가 뜬다.
//		// 그 이유는 Customer 는 Thread 를 상속해준것이 아니라 Thread 클래스에 implements 되어있는 Runnable 을 implement 했기 때문이다.
//		// Runnable 은 인터페이스로 public void run();의 추상형태로 저장되어 있을뿐 자세한 기능은 Thread에 오버라이딩 되어
//		// 저장되어 있기 때문에 오류가 발생하는 것이다. 
//		// Runnable 을 직접 implements 해서 사용하는 경우 Thread c1 = new Thread(new Customer()); 로 메인에서 객체화해야한다.
//		
//		
		
		Cafe cafe = new Cafe();  // 카페 개장
		
		Thread barista = new Thread(new Barista(cafe));
		Thread customer = new Thread(new Customer(cafe));
		
		customer.start();  // 손님 스레드 시작 - 주문할 결심
		barista.start();  // 바리스타 스레드 시작 - 제조할 준비 완료 
	}

}


/*

카페에서 손님이 주문한다.
주문을 하면 바리스타가 제조한다.
몇명의 손님이 주문하든지 주문한 순서대로 바리스타들이 제조해야한다.


*/


// JSP - java server page
// PHP - personal home page
