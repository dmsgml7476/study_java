package exception3;

public class MainMt {

	public static void main(String[] args) {
 
		
		String str = "123ab";
		int num=0;
		try {
			num = Integer.parseInt(str); // Integer.parseInt()는 문자열 -> 정수변환
		} catch (Exception i) {
			System.out.println("뭐가 틀림?");
			i.printStackTrace();
		}
		System.out.println("정수 : " + num);

		String word = "good Bye!!";
		System.out.println(word.substring(word.indexOf("B")));
		try {
			
			System.out.println(word.substring(word.indexOf("m")));
		} catch (Exception e) {
			System.out.println("m이 존재하지 않아");
		}

	}

}
