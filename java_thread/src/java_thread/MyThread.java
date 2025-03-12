package java_thread;

public class MyThread extends Thread {  //Thread <- 자바내 클래스
//	// 스레드를 생성하여 동작되게 하려면 run 메서드가 필요하다.
//	// 기존의 프로그램(프로세스)는 main메서드부터 시작
//	// 새로 만들어준 스레드는 run메서드 부터 시작
//	@Override
//	public void run() {
//		// 기본 형태
//	}
	
	public MyThread() {}
	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("스레드 시작!");
		for(int i=1; i<=10; i++) {
			System.out.println(i + this.getName());
			try {Thread.sleep(1000);} catch (Exception e) {}	
		}
	}
	
	
}
// 스레드 구현 방법
// 1.Thread 클래스 상속
// 2.  Runnable 인터페이스 구현