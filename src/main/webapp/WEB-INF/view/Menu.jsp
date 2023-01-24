<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% page import="dto.Account" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="icon" type="image/png" href="">
</head>
<body>
<body>
	<%
		Accounts ac = (Accounts)session.getAttribute("user");
	%>
	
	<div class="main_contents">
		<div class="sub_header">
			<form action="ProductSearchNameServlet" class="search-form-003">
			    <label>
			        <input type="text" name="name" placeholder="キーワードを入力">
			    </label>
			    <button type="submit" aria-label="検索"></button>
			</form>
		</div>	
	</div>
	<div>
		<a href=""></a><br>
		<a href=""></a><br>
		<a href=""></a><br>
		<a href=""></a><br>
	</div>
	
	<footer>
		<p><small>&copy; morishopbox</small></p>
	</footer>

</body>
</html>