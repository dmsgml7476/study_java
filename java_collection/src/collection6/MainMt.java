package collection6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MainMt {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		
		set.add("이순신");
		set.add("김유신");
		set.add("이성계");
		set.add("강감찬");
		set.add("문익점");
		set.add("박문수");
		set.add("정약용");
		
		
		set.add("김유신");
		System.out.println(set);
		
		// HashSet은 직접 값 한개씩 출력 불가
		// HashSEt 에 저장되어 있는 값 하나씩 출력하는 방법 1 : ArrayList 사용
		
		ArrayList<String> array = new ArrayList<>(set);
		
		System.out.println(array.get(2));
		
		// HashSEt 에 저장되어 있는 값 하나씩 출력하는 방법 2 : Iterator, while, hasNext
		
		Iterator<String> it = set.iterator();  // 뒤에 iterator()는 대문자 X 소문자 O
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 거래내역 = 3달 치 거래내역 가져옴
		// 만원이하, 5만원이하, 10만원이하
		// 거래 내역을 데이터베이스에서 가져와서 ArrayList 나 vector에 저장
		// 반복문 돌리면서 if 문 사용해서 만원 이햐인 경우 
		// HashSet A에 저장, 5만원 이하는 HashSet B에 저장
		// HashSet C에는 10만원 이하 저장
		
		set.remove("김유신");
		System.out.println(set);
		System.out.println(set.contains("강감찬"));
		
		// 집합 직접 구현 하기
		HashSet<String> 찬양과일 = new HashSet<>();
		찬양과일.add("바나나");	찬양과일.add("수박");
		찬양과일.add("딸기"); 찬양과일.add("참외");
		찬양과일.add("키위"); 찬양과일.add("메론");
		
		HashSet<String> 예나과일 = new HashSet<>();
		예나과일.add("체리");	예나과일.add("자두");
		예나과일.add("메론");	예나과일.add("무화과");
		예나과일.add("망고");	예나과일.add("바나나");
		예나과일.add("수박");	예나과일.add("오렌지");
		
		HashSet<String> 교집합 = new HashSet<>();
		Iterator<String> 과일 = 찬양과일.iterator();    // 1회성
		while(과일.hasNext()) {
			String fruit = 과일.next();
			if(예나과일.contains(fruit)) {
				교집합.add(fruit);
			};
		}
		System.out.println(교집합);
		
		// 차집합
		// 찬양과일의 차집합 구하기
		
		HashSet<String> 차집합 = new HashSet<>();
		
		과일 = 찬양과일.iterator();  // Iterator 는 일회용이기에 다시 대입
		while(과일.hasNext()) {
			String fruit= 과일.next();
			if (!예나과일.contains(fruit)) {
				차집합.add(fruit);
			}
		}
		
		System.out.println(차집합);
		
		// 합집합
		// 찬양과일과 예나과일의 모든 과일
		HashSet<String> 합집합 = new HashSet<>();
		
		
		과일=찬양과일.iterator();
		while(과일.hasNext())
			합집합.add(과일.next());
		
		과일 = 예나과일.iterator()	;
		while(과일.hasNext())
			합집합.add(과일.next()	);
		
		System.out.println(합집합); // 중복없이 전체 조회

		
		// 위에처럼 직접 해줄 필요 없음. Set메서드에 다 있는 기능임. 
		// Set 메서드를 이용하여 교집합, 차집합, 합집합
		HashSet<String> 교집합2 = new HashSet<>(찬양과일);
		
		교집합2.retainAll(예나과일);  // retainAll = 교집합
		System.out.println(교집합2);
		
		
		HashSet<String> 차집합2 = new HashSet<>(찬양과일);
		
		차집합2.removeAll(예나과일);  // 차집합
		System.out.println(차집합2);
	
		HashSet<String> 합집합2 = new HashSet<>(찬양과일);
		합집합2.addAll(예나과일); // addAll = 합집합
		System.out.println(합집합2);
	
	
	
	}
	

}


/*

Set - 순차저장 안됨, 중복불가

HashSet - 그룹화 목적(집합 - 교집합, 합집합, 차집합)
TreeSet - 오름차순 정렬, 검색에 특화

*/







