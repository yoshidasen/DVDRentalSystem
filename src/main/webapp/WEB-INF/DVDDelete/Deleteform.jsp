<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.DVD" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DVD削除</title>
</head>
<body>
	<h1>情報削除</h1>
	<%
		request.setCharacterEncoding("UTF-8");
		String errorCode = request.getParameter("error");
		if(errorCode != null && errorCode.equals("1")){
			DVD dvd = (DVD)session.getAttribute("input_data");
	%>
	<p style="color:red">削除に失敗しました</p>
	<form action="DVDDeleteConfirmServlet" method="post">
		<input type="text" name="name" value="<%=dvd.getName()%>" placeholder="名前"><br>
		<input type="submit" value="登録">
	</form>
	<%
		} else {
	%>
	<form action="DVDDeleteConfirmServlet" method="post">
		<input type="text" name="name" placeholder="名前"><br>
		<input type="submit" value="削除">
	</form>
	<%
		}
	%>
</body>
</html>