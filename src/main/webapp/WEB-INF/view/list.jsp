
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>

<%@ page import="dto.DVD" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>一覧表示</title>
</head>
<body>
<form action="SelectListServlet" method="post">
<p>商品検索:<input type="text" name="name"></p>
<input type="submit" value="検索">
</form>
<h1>商品一覧</h1>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>名前</th>
			<th>監督名</th>
			<th>商品番号</th>
			<th>貸し出し</th>
		</tr>
	<%
	List<DVD> list = (ArrayList<DVD>)request.getAttribute("list");
	for(DVD s : list) {
	%>
		<tr>
			<td><%=s.getId() %></td>
			<td><a href="detailServlet"><%=s.getName() %></a></td>
			<td><%=s.getDirected_by() %></td>
			<td><%=s.getNumber() %></td>
			<td><%=s.getRental() %>
		</tr>
	<%} %>
	</table>

</body>
</html>