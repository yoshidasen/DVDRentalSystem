<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.DVD" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>情報更新</title>
</head>
<body>
	<h1>情報変更</h1>
	<%
		request.setCharacterEncoding("UTF-8");
			DVD dvd = (DVD)session.getAttribute("input_data");
	%>
	<form action="DVDUpdateSuccessServlet" method="post">
		<input type="text" name="name" value="<%=dvd.getName()%>" placeholder="名前"><br>
		<input type="text" name="directed_by" value="<%=dvd.getDirected_by()%>" placeholder="監督"><br>
		<input type="text" name="number" value="<%=dvd.getNumber()%>" placeholder="商品番号"><br>
		<input type="submit" value="情報を更新する">
	</form>
</body>
</html>