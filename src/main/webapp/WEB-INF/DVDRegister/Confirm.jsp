<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.DVD" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録内容確認</title>
</head>
<body>
	<h1>新規確認</h1>
		<p>下記の内容で登録します。よろしいですか？</p>
		<%
		DVD dvd = (DVD)session.getAttribute("input_data");
		%>
		名前：<%=dvd.getName() %><br>
		監督：<%=dvd.getDirected_by() %><br>
		商品番号：<%=dvd.getNumber() %><br>
	<a href="DVDRegisterSuccessServlet">登録</a>
	<br>
	<a href="DVDRegisterServlet">戻る</a>
</body>
</html>