<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.DVD" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>情報変更</title>
</head>
<body>
	<h1>情報変更</h1>
	<%
		request.setCharacterEncoding("UTF-8");
		String errorCode = request.getParameter("error");
		if(errorCode != null && errorCode.equals("1")){
			DVD dvd = (DVD)session.getAttribute("input_data");
	%>
	<p style="color:red">データがありません</p>
	<form action="DVDUpdateFormServlet" method="post">
		<input type="text" name="name" value="<%=dvd.getName()%>" placeholder="名前"><br>
		<input type="submit" value="更新画面へ">
	</form>
	<%
		} else {
	%>
	<form action="DVDUpdateFormServlet" method="post">
		<input type="text" name="name" placeholder="名前"><br>
		<input type="submit" value="情報変更画面へ">
	</form>
	<%
		}
	%>
</body>
</html>