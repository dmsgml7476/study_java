<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">

* {
	margin : 0;
	padding : 0;
	box-sizing: border-box;
}

#post {
	background-color : #f0f0f0;
	border-radius: 7px;
	display : flex;
	flex-direction: column;
	margin : 10px;
	padding : 10px;
	width : 600px;
	height : 700px;
	align-items: center;
	justify-content: center;
}


#postForm {
	display: flex;
	flex-direction : column;
	width : 100%;
	height : 100%;
}

#titleBox {
	display: flex;
	justify-content: space-between;
	margin : 10px 0 ;
	padding : 5px;
	background-color: #bbbbbb;
	border-radius : 7px;

}

#title {
	text-align : center;
	display: flex;
	justify-content: center;
    align-items: center; 
}

#titleInput {
	width : 93%;
}

#informationBox {
	display : flex;
	
}

#writerBox {
	margin : 0 10px 0 0 ;
	width: 100%;
	padding : 5px;
	background-color: #bbbbbb;
	border-radius : 7px;
}

#postDateBox {
	width : 40%;
	padding : 5px;
	background-color: #bbbbbb;
	border-radius : 7px;
}

.input {
	width : 100%;
	height : 30px;
	border-radius : 5px;
	outline : none;
	border : none;
	padding : 5px;
}

#contentBox {
	width : 100%;
	height : 100%;
	margin : 10px 0;
	padding : 10px;
	background-color: #bbbbbb;	
}

#content {
	width : 100%;
	height : 100%;
	padding : 10px;
	border : 1px solid white;
	outline : none;
	resize: none;
	font-size: 16px;
    line-height: 1.5;
	vertical-align: top;
}

#content::placeholder {
    color: #888;
    font-size: 14px;
}

#but {
	border : none;
	outline : none;
	background-color : #444444;
	color : white;
	height : 40px;

	border-radius : 5px;
}

</style>


</head>

<script>


window.onload = function(){
	
	const form = document.getElementById("postForm");
	const titleTxt = document.getElementById("titleInput");
	const writeNic = document.getElementById("writerInput");
	const content = document.getElementById("content");
	
	form.addEventListener("submit", (event)=>{
		
		
		if (titleTxt.value.trim().length === 0) {
			alert("제목을 입력하세요.");
			event.preventDefault();
			return;
		}
		
		const num = writeNic.value.trim().length;
		if (num <1 || num > 6 ) {
			alert("닉네임을 1~6자 사이로 입력하세요")
			event.preventDefault();
			return;
		}
		
		if (content.value.trim().length === 0) {
			alert("본문 내용을 입력하세요");
			event.preventDefault();
			return;
		}
		
		alert("성공적으로 포스트가 업로드되었습니다.");
		location.href = "board.jsp";
		
	});
	
}


</script>

<body>

	<div id="post">
		<h2>글 포스트</h2>
		
		<form id="postForm" method = "post" action = "save.jsp">
			<div id="titleBox">
				<div id = "title">제목</div>
				
				<input id="titleInput" class = "input" type = "text" name="titleTxt" placeholder = "제목을 입력하세요"></input>
			</div>
			
			<div id="informationBox">
				<div id="writerBox">
					<div id="writer">작성자</div>
					
					<input id="writerInput" class = "input" type = "text" name="writerNic" placeholder ="1~6자내로 입력해주세요">
				
				</div>
			
				<div id="postDateBox">
					<div id="postDate">작성일</div>
				
					<input id="postDateInput" class = "input" type = "date" name="postDate" value="2025-03-15">
				</div>
			</div>
			
			<div id = "contentBox">
				<textarea id = "content" name="content" placeholder="본문내용을 입력하세요"></textarea>
			</div>
			
			<button id="but">업로드</button>
		
		</form>
	
	</div>

</body>
</html>