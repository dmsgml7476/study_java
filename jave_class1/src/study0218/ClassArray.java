package study0218;

public class ClassArray {

	public static void main(String[] args) {
//		Member mem = new Member();
//		mem.name="김유신";
//		mem.job="군인";
//		mem.age=38;
//		
//		// String name = new String();
//		// String [] names = new String[3];
//		
//		Member[] members = new Member[5];
//		// 5명의 정보 저장 가능하긴 한데 아직... // 선언을 해서 참조변수 5개를 만들었을 뿐. 값은 대입해주지 않았다.
//		for (int i = 0; i<members.length; i++) {
//			members[i] = new Member();
//		}
//		
//		members[0].job = "감찰관";
//		members[0].name = "박문수";
//		members[0].age = 34;
//		members[1].name = "이순신";
//		members[1].job = "군인";
//		members[1].age = 31;
//		members[2].name = "문익점";
//		members[2].job = "산업스파이";
//		members[2].age = 45;
//		
//		
//		for (int i=0; i<members.length; i++) {
//			System.out.println(members[i].name);
//			System.out.println(members[i].job);
//			System.out.println(members[i].age);
//		}
//		System.out.println(members[0].name);
		//int[] a = new int[] {1,2,3,4,5}
		
		Member info = new Member()/*<- 생성자 메소드*/;
		System.out.println(info);
		
		Movie info2 = new Movie();
		info2.title = "겨울왕국";
		info2.genre = "애니메이션";
		info2.num = 10320000;
		info2.year = 2014;
		 
		System.out.println("제목 : " + info2.title);
		System.out.println("장르 : " + info2.genre);
		System.out.println("관객수 : " + info2.num);
		System.out.println("개봉년도 : " + info2.year);
		
		System.out.println(info.name);
		
		Member m1 = new Member();
		System.out.println(m1.name);
		
		Member info3 = new Member(20, "군인", "김유신");
		System.out.println(info3.job);
		

	}

}

/*

	영화 제목, 장르, 관객수, 개봉년도
	위 항목의 데이터를 저장 할 수 있는 클래스 정의
	영화 한편에 대한 데이터 입력하고 출력까지


*/



