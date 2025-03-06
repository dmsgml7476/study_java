package collection1;

import java.util.ArrayList;

public class MainMt {

	public static void main(String[] args) {
		
		
//		int[] a= new int[] {1,2,3,4,5};  // 배열은 한 번 정한 크기를, 프로그램 실행 도중 변경할 수 없다.
//		
		// 배열에 정수를 추가 저장 될 수 있게

		
		MyArray a = new MyArray();
		a.add(100);
		a.add(20);
		a.add(50);
		a.add(1232);
		a.add(543);
		
		
//		System.out.println( a.get(11) );
		
		ArrayList list = new ArrayList();   // ArrayList는 원래 제네릭타입이 존재해야함. 
		list.add(100);                      // 제네릭 타입을 넣어야하는데 제네릭이 지정안되었기 때문에
		list.add(2313);						// for-each 구문에서 for(타입 지역변수 : 배열변수)에
		list.add("장미란");					// 리스트 배열의 데이터들은 Object 타입이다.
		list.add("포카칩");
		list.add(3.144);
		
		System.out.println(list.size()); // 크기 - 데이터몇개 저장되어있는가
		
		System.out.println(list.get(2));
		// 타입 지정 안할시 object 타입으로 되어 있음. 최상위 객체이기 때문에 모든 타입이 들어갈 수 있음.
		
		System.out.println(list.indexOf("포카칩"));  // 배열에 특정데이터 어디?
		
		list.remove(0); // 인덱스를 지정하여 해당 데이터 삭제
		list.remove("포카칩"); //삭제 할 데이터 입력하여 삭제
		System.out.println(list); //ArrayList 에 toString 이 포함되어 있기 때문에
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(Object o : list) {
			System.out.println(o);
		}
		
		list.add(1, "내가원하는곳");  // list.add(인덱스, 데이터) - 원하는 인덱스 위치에 데이터를 넣어줄 수 있다.
		
		System.out.println("원하는 위치에 데이터 넣기 : 배열변수.add(인덱스, 데이터) -> list : " + list);
		
		System.out.println(list.contains("장미란"));
		
		list.clear(); // 배열 모두 삭제
		
		System.out.println("배열 모두 삭제(.clear) : " + list);  
		
		// 자바 631 쪽에 ArrayList 주요 메서드 정리되어 있음.
		
		
		
		

	}

}


/*
 
 자바 컬렉션 프레임 워크
 자료구조와 알고리즘을 클래스화 시켜놓은것.
 자료구조-데이터를 저장관리하는 방법
 알고리즘 - 저장된 데이터를 가공하는 방법
 
 
 Collection          Map
   Liste(interface)		HashMap
   	  ArrayList*		TreeMap
   	  LinkedList*		Properties
   	  Vector
   	  Stack
   	  Queue
   Set
   	  HashSet
   	  TreeSet
 
 */





