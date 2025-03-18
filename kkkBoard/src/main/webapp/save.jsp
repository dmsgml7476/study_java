<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<%
String title = request.getParameter("titleTxt");
String writer = request.getParameter("writerNic");
String postDate = request.getParameter("postDate");
String content = request.getParameter("content");



Connection conn = null;

try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	String user = "peh";
	String pw = "1234";
	String url = "jdbc:mysql://localhost:3306/peh";
	
	conn = DriverManager.getConnection(url, user, pw);
	
} catch (Exception e) {
	System.out.println("드라이브 로드 실패 및 접속 실패");
	e.printStackTrace();
	
}


PreparedStatement ps = null;
ResultSet rs = null;

String sql = "insert into kkk_board (title, writer, post_data, content) "+"value (?,?,?,?)";


try {
	
	ps = conn.prepareStatement(sql);
	ps.setString(1, title);
	ps.setString(2, writer);
	ps.setString(3, postDate);
	ps.setString(4, content);
	
	ps.executeUpdate();
	
	response.sendRedirect("board.jsp");
	
} catch (SQLException e) {
	System.out.println("데이터 저장 실패");
	e.printStackTrace();
}
    

    
    
    
    
    
%>
    
    
    
    