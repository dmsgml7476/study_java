<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!-- signUpSave -->
<%



Connection conn = null;


try {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	String user = "peh94";
	String pw = "1234";
	String url = "jdbc:mysql://210.219.170.244:3306/peh94";
	
	conn=DriverManager.getConnection(url, user, pw);
	
} catch (Exception e) {
	System.out.println("드라이버 로드 실패 및 접속 실패");
	e.printStackTrace();
}


PreparedStatement ps= null;

String email = request.getParameter("email");
String password = request.getParameter("password");
String name = request.getParameter("name");
String tel = request.getParameter("tel");
String tempYear = request.getParameter("birthYear");
String tempMonth = request.getParameter("birthMonth");
int year = Integer.parseInt(tempYear);
int month = Integer.parseInt(tempMonth);

String sql = "insert into test_member(email, password, name, tel, birth_year, birth_month) "+"value (?,?,?,?,?,?)";

try {
	ps=conn.prepareStatement(sql);
	ps.setString(1, email);
	ps.setString(2, password);
	ps.setString(3, name);
	ps.setString(4, tel);
	ps.setInt(5, year);
	ps.setInt(6, month);
	ps.executeUpdate();

} catch (SQLException e) {
	System.out.println("데이터 저장 실패");
	e.printStackTrace();
}


%>

<%=email%>