<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 class="text-center">Register Successfully</h1>
<hr>
<h2>Name : ${user.fullname }</h2>
<h2>Email : ${user.email }</h2>
<h2>Password : ${user.password }</h2>
<h2>Image Name : ${user.image }</h2>
</body>
</html>