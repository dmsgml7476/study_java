package customer;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.util.Scanner;
import java.util.Date;

import store.Banana;
import store.Fruit;
import store.Grape;
import store.Orange;

public class MainMethod {

	public static void main(String[] args) {
		// 바나나와 포도, 오랜지, 갯수가 많이 필요하다면???
		// 바나나 - 15개, 포도 - 6개, 오랜지 - 54개
		// 망고, 수박, 토마토 등등등
		

//		
//		Banana[] ba = new Banana[15];
//		
////		ba[0].makeJuice(); // 아직 Banana 객체가 null이기에 오류
//
//		ba[0] = new Banana(2500,500);
//		ba[1] = new Banana(3500,500);
//		ba[2] = new Banana(4500,500);
//		
//		ba[0].makeJuice();
		
		// 다형성 = 하나의 타입으로 여러 타입을 다룰 수 있다.
		// 상속관계, implements
		
		
//		Fruit f = new Banana(2500, 500);
//		f.makeJuice();
//		Fruit g = new Grape(3500, 400);
//		g.makeJuice();
		
		Fruit[] menu = new Fruit[10];
		
		// 데이터베이스 연결하기 (드라이버로드)
		// com.mysql.cj.jdbc.Driver
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		}
		
		// 계정 로그인 = 주소, db명, 계정명, 비밀번호
		
		String user = "peh";
		String password = "1234";
		String url = "jdbc:mysql://localhost:3306/peh";
		
		// 데이터베이스와 연결한 객체를 저장해둬야한다.
		
		Connection conn = null; // 데이터베이스 연결 객체 저장할곳
		
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("접속 실패");
			e.printStackTrace();
		}
		
		// 쿼리문 작성하여 보내고 받기
		
		// select * from store_menu1;
		
		String sql="select * from store_menu1";  // 조회 쿼리문
		// 작성한 쿼리문을 데이터베이스에 보내려면
		// Statement, PreparedStatment 사용
	
		Statement st = null; // 쿼리문 보낼때 필요
		ResultSet rs = null; // 조회 결과 받을때 필요
		
		
		
		try {
			st=conn.createStatement();  // 쿼리문 전송하기 위한 준비
			rs=st.executeQuery(sql);
			
			// rs.next 를 통해서 조회된 결과값이 존재하는지 확인
			for(int i=0; rs.next() ; i++) {
				
				int cost = rs.getInt("cost"); // 금액
				int cap = rs.getInt("capacity"); // 용량
				String type = rs.getString("fruit_type");

				if(type.equals("banana"))
					menu[i] = new Banana(cost, cap);
				if(type.equals("grape"))
					menu[i] = new Grape(cost, cap);
				if(type.equals("orange"))
					menu[i] = new Orange(cost, cap);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("쿼리문 조회 실패");
			e.printStackTrace();
		}	
		
		// 데이터베이스에서 조회한 데이터들을 바나나, 포도, 오렌지 객체로 저장될 수 있게 하기
		
		
//
//		
//		menu[2].makeJuice();
//		menu[6].pieceFruit();
		
		Buyer ctm1 = new Buyer(10000); // 구매자 예산
		
		for(int i=0; i<menu.length; i++) {
			System.out.println((i+1)+". " +menu[i]);
			
		}
		
		// 어떤 주스를 사먹을거냐!!
		Scanner sc = new Scanner(System.in);
		System.out.print("구매 번호 : ");
		int num = sc.nextInt();
		
		// 결제 진행하고 언제 주소를 사먹었는지 어떤 주스인지 기록
		
		 ctm1.setMoney(ctm1.getMoney()-menu[num-1].getCost());
		 
		 
		 // 내가 만약 5번 선택했다면 num-1 은 4니까
		 // menu배열열의 4번  인덱스의 객체를 선택한 것이고.
		 // 헤딩객체의 getCost니까 cost 변수의 값을 가지고온다.
		 // cmtl.getMoney  get으로 시작하는 메서드 변수 값 출력이니까
		 // 10000을 가지고 온다.
		 // 그러니까 10000 - 3500 이 된다. 이것의 결과 6500 을 setMoney를 통해
		 // money 변수에 저장하게 되니 money 변수는 6500을 가진다.
		 
		 ctm1.setBuyDate(new Date());
		 ctm1.setItem(menu[num-1]);
		
//		for(Fruit m : menu) {
//			System.out.println(m);
//		}
		System.out.println(ctm1);
		
		System.out.println("보유 금액 : " + ctm1.getMoney());
		
	}	

}



/*

자바 프로그램에서 데이터베이스 사용하기
1. 데이터베이스와 연결하기 위한 드라이버 로드
2. 계정 로그인
3. 쿼리문 작성하여 주고 받고 하기



*/


