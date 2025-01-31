package study0124;

public class Javaif1 {

	public static void main(String[] args) {
		// 바이킹 탑승 - 키가 140 이상 만 탑승
		int tall = 163;
		// if 문에는 조건식이 반드시 if 뒤에 붙어야한다.
		if (tall >= 140) {// 중괄호는 조건에 따라 실행될 내용작성
			System.out.println("탑승가능");
			System.out.println("키가 140 이상이다.");
		    int a = 10;
		    a = 132+2;
		} else { // else 는 조건식이 거짓일 경우 실행
			System.out.println("탑승 불가");
		}
		// where 가 들어가 있는 쿼리문은 자바에서는 if 다.
		
		// 두 숫자 중 큰수는?
		int num1 = 35, num2 = 12;
		
		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		
		// 철수와 민수 중 누구 발이 큰가?
		
		int 철수 = 275, 민수 =260;
		
		if (철수 > 민수) {
			System.out.println("철수가 발이 더 크다 : " + 철수);
		} else {
			System.out.println("민수가 발이 더 크다 : " + 민수);
		}
		
		// 편의점에서 도시락을 사먹는데, 가격이 5200원이다.
		// 내 통장 잔액이 4530원 이라면, 얼마를 이채해야하나?
		// 잔액이 충분하다면 이체할 필요 없다.
		
		
		int money = 4530;
		int 도시락 = 5200;
		
		if (money >= 도시락) {
			System.out.println("이체 필요 없음. 결제 가능");
		} else {
			System.out.println((도시락-money) + "원 입금 요망");
		}
		
		
		// 바이킹 탑승 조건 - 키가 140이상 190이하 만 가능
		
		
		if (tall >= 140 && tall <= 190) {
			System.out.println("탑승 가능");
		} else {
			System.out.println("탑승 불가");
		}
		
		// 후룸라이드를  탑승하려면 키가 130 이상 이거나 몸무게 45kg 이상만 가능
		
		tall = 160;
		int wg = 60;
		
		if (!(tall >= 130 || wg >= 45)) {
			System.out.println("탑승 불가");
		} else {
			System.out.println("탑승 가능");
		}
		
		
		
		
	}

}
