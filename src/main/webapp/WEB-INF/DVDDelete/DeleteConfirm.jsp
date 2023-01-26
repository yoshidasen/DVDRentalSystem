<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.DVD" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>削除内容確認</title>
</head>
<body>
	<h1>削除確認</h1>
		<p>下記の内容を削除します。よろしいですか？</p>
		<%
		DVD dvd = (DVD)session.getAttribute("input_data");
		%>
		名前：<%=dvd.getName() %><br>
		監督：<%=dvd.getDirected_by() %><br>
		商品番号：<%=dvd.getNumber() %><br>
	<a href="DVDDeleteSuccessServlet">削除</a>
	<br>
	<a href="DVDDeleteServlet">戻る</a>
</body>
</html>