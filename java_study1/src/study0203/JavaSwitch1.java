package study0203;

public class JavaSwitch1 {

	public static void main(String[] args) {
//		// switch 문
//		// if 문
//		
//		switch("가나다") { // switch ()에 들어가는 값고, case 이름은 같은 타입이어야한다.
//			case 가나다:
//				System.out.println("1을 선택");
//				if () {
//					break;  // case 안의 if는 break 사용이 가능하다.
//				}
//				break;   // switch는 하위 코드가 전부 실행되므로 하위가 실행되지 않도록 강제로 코드를 종료시켜준다.
//				         // 해당 제어문 강제종료
//						 // if 문에서는 사용 불가능.
//			case 3:
//				System.out.println("3를 선택");
//				break;
//			case 10:
//				System.out.println("10을 선택");
//				break;
//		}   // 선택한 케이스부터 뒤의 케이스를 종료시점(})까지 전부 출력한다.
//		    // if 는 조건식이 참일때 중괄호 안에 있는 모든 코드가 출력된다.


		int num = 50;
		switch(num) {
		case 10 : System.out.println("10선택");
		break;
		case 30 : System.out.println("30 할꺼야???");
		break;
		case 20 : System.out.println("case 에 표현하는데데이터는 정수, 문자, 문자열");
		break;
		case 50 : System.out.println("입력된 갑에 맞는 case 실행은" + "break Ehsms } 까지 실행");
		break;
		default:
			System.out.println("case에 없는 값이야!! 다시 해!!");
			
			/* if (점수 <=100 && 점수 >=90) {
			 * 		"A학점"
			 * } else if (점수 >= 80) {
			 * 		"B학점"
			 * }
			
			*/		//=> 이 if 문을 switch 로 표현하기
			
		int 점수 = 79;
		
		switch(점수) {
		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:
		case 90:
			System.out.println("A학점");
			
		}   //  너무 번거롭다.
		
		switch(점수/10) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		}
			
			
		}
	}

}
