package inner1;

public class Test {


	   static int count=1; //클래스 변수(정적변수): 프로그램 처음 시작 할때
	   int age; //인스턴스변수: 객체를 생성할 때 쓰는 것을 인스턴스라고 함.
	   A a;
	   
	   static Dog d;
	   
	   Test(){
	      a = new A();
	   }
	   
	   static void origin() { // 클래스 메서드
//		   a.view(); - 오류 : 너무 뒤에 있기에 존재하지 않는 것을 불러오려고 하는것.
//		   A bb = new A(); - 오류 : 클래식 메서드에 인스턴스 ㄴㄴ
	   }
	   
	   // 정적 내부 클래스 (static)
	   static class Dog{
		   int year;
	   }
	   
	   void setYear(int year) {
		   d = new Dog();
		   d.year =year;
	   }
	   
	   //인스턴스 내부클래스 정의: 노출시키지 않는다는 것 - 외부 클래스의 객체 생성해야 사용
	   class A{
	      int num;
	      void view() {System.out.println("내부클래스 메서드");}
	   }
	   
	   void setNum(int num) {
	      this.a.num=num; //클래스 내부에서만 노출되도록 메서드로 씀
	   }
	   
	   
	   void sum() {
	      int a,b; //지역변수:
	   }
	   
	   void innerView() {
		   this.innerView();
	   }
	
	
}
// 내부클래스 - 크래스 내부에 만드는 클래스
// 내부 클래스는 여러개의 클래스와 관계를 맺는게 아니라 하나의 클래스와 상속 또는 포함 관계를 맺을 경우에 사용하면 효과적이다.

/*

static 변수 또는 메서드-> 프로그램 실행하면서 클래스가 메모리에 로드 되면 공간 할당
인스턴스 변수 또는 메서드 ->  new 연산자를 통해 클래스의 공간을 생성해야 존재
지역변수 -> 메서드를 호출 해야 하는 상화
static 변수 또는 메서드 -> 인스턴스변수 또는 메서드 -> 메서드 호출해야 지역변수 생성

*/