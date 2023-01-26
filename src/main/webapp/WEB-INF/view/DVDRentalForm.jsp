<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>貸出</title>
<link rel="stylesheet" href="./css/style_y.css">
</head>
<body>
	<header id="header">
	  <div class="logo"><img class="logo" src="" alt="logo"></div>
	  <nav>
	    <ul class="nav__list">
	    	<li class="nav__item"><a href=""></a></li>
			<li class="nav__item"><a href=""></a></li>
			<li class="nav__item"><a href=""></a></li>
			<li class="nav__item"><a href=""></a></li>
		</ul>
	  </nav>
	</header>
	<%
		Accounts ac = (Accounts)session.getAttribute("user");
		int id = Integer.parseInt(request.getParameter("id"));
	%>


	<a href="DVDRentalSuccessServlet?id=<%=id %>" class="submit">借りる</a>
	<a href="" class="submit">戻る</a>
	<a href="Menu.jsp" class="submit">ホームに戻る</a>
	
	<footer>
		<p><small>&copy; morijyobi</small></p>
	</footer>
	
</body>
</html>