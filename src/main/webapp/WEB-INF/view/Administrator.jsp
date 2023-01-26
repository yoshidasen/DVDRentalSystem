<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.DVD_Account" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理者画面</title>
<link rel="stylesheet" href="./css/style_y.css">
<link rel="icon" type="image/png" href="">
</head>
<body>
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
		DVD_Account ac = (DVD_Account)session.getAttribute("user");
	%>
	<div class="contents">
		<article>
			<img class="title" src="./img/title.png"><br>
			
			<script class="today">
				var today=new Date();
				var year = today.getFullYear();
				var month = today.getMonth()+1;
				var week = today.getDay();
				var day = today.getDate();
		
				var week_ja= new Array("日","月","火","水","木","金","土");
				
				var days = year+"年"+month+"月"+day+"日 "+week_ja[week]+"曜日";
				document.write("<span style='font-weight:bold;font-size:30px;background-color:#B3E8E8;color:#304E63;margin:40px;'>"+year+"年"+month+"月"+day+"日 "+week_ja[week]+"曜日"+"</span>");

			</script>
		
			<img class="home_image" src="./images/dvd.png"><br>
		
		</article>
		
		
		<form action="" class="search-form-003">
		    <label>
		        <input type="text" name="name" placeholder="キーワードを入力">
		    </label>
		    <button type="submit" aria-label="検索" ></button>
		</form>
		
		<div class="container">
			<div class="item"><a href="">一覧</a><br></div>
			<div class="item"><a href="">追加</a><br></div>
			<div class="item"><a href="">削除</a><br></div>
			<div class="item"><a href="">更新</a><br></div>
		</div>
	</div>
	
	<footer>
		<p><small>&copy; morijyobi</small></p>
	</footer>

</body>
</html>