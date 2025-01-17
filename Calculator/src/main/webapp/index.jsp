<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>My Calculator</title>
	<link rel="stylesheet" href="styles.css">
</head>
<body>
	<img src="Happy.webp">
	<h1>Answer : <%= request.getParameter("ans")%></h1>
	<form action="myServlet" method="post">
		<input name="num1" placeholder="Number 1">
		<input name="num2" placeholder="Number 2">
		
		<button name="btn1" value="1"> + </button>
		<button name="btn1" value="2"> - </button>
		<button name="btn1" value="3"> * </button>
		<button name="btn1" value="4"> / </button>
	</form>
</body>
</html>