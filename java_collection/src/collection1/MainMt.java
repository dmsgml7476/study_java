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
		
		
		System.out.println( a.get(11) );
		
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(2313);
		list.add("장미란");
		list.add("포카칩");
		list.add(3.144);
		
		System.out.println(list.size()); // 크기 - 데이터몇개 저장되어있는가
		
		System.out.println(list.get(2));
		// 타입 지정 안할시 object 타입으로 되어 있음. 최상위 객체이기 때문에 모든 타입이 들어갈 수 있음.
		
		System.out.println(list.indexOf("포카칩"));  // 배열에 특정데이터 어디?
		
		list.remove(0); // 인덱스를 지정하여 해당 데이터 삭제
		list.remove("포카칩"); //삭제 할 데이터 입력하여 삭제
		System.out.println(list);
		
		

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





