<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.DVD" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DVD登録</title>
</head>
<body>
	<h1>新規登録</h1>
	<%
		request.setCharacterEncoding("UTF-8");
		String errorCode = request.getParameter("error");
		if(errorCode != null && errorCode.equals("1")){
			DVD dvd = (DVD)session.getAttribute("input_data");
	%>
	<p style="color:red">登録に失敗しました</p>
	<form action="DVDRegisterConfirmServlet" method="post">
		<input type="text" name="name" value="<%=dvd.getName()%>" placeholder="名前"><br>
		<input type="text" name="directed_by" value="<%=dvd.getDirected_by()%>" placeholder="監督"><br>
		<input type="text" name="number" value="<%=dvd.getNumber()%>" placeholder="商品番号"><br>
		<input type="submit" value="登録">
	</form>
	<%
		} else {
	%>
	<form action="DVDRegisterConfirmServlet" method="post">
		<input type="text" name="name" placeholder="名前"><br>
		<input type="text" name="directed_by" placeholder="監督"><br>
		<input type="text" name="number" placeholder="商品番号"><br>
		<input type="submit" value="登録">
	</form>
	<%
		}
	%>
</body>
</html>