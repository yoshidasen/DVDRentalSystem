<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Accounts ac = (Accounts)session.getAttribute("user");
		int id = Integer.parseInt(request.getParameter("id"));
	%>


	<a href="DVDReturnSuccessServlet?id=<%=id %>">返す</a>
	<a href="">戻る</a>
</body>
</html>