<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 
    
    <%!
    // 선언문 = 변수, 메서드선언, 클래스 정의
    // for문 if문 계산식 제어문 등등 사용 불가
    
    int age =0;
    int[] arr = new int []{10,20,30,40,50,60};
    %>
    
    <%
    // 스크립틀릿
    // 자바 전부 다 됨. 근데 메서드와 클래스 정의하는 것은 선언문으로.
    age=25;
    
    %>
    

    
    <%=
    // 표현식 = 출력
    age
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Html 주석 -->
	<%-- jsp 주석 --%>
	<h1><%= age %></h1>
	
	<ul>
		<%
			for(int i =0; i<arr.length; i++) {
		%>
		<li> <%=arr[i] %> </li>
		<%} %>
		
		
		<% for (int i =0; i<arr.length; i++) {
			out.print("<li>"+arr[i]+"</li>");	
		}%>
		
	</ul>

</body>
</html>