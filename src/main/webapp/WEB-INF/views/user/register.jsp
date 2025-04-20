<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
<h2>회원가입</h2>
<form method="post" action="/user/register">
    <input type="text" name="username" placeholder="아이디" required />
    <input type="password" name="password" placeholder="비밀번호" required />
    <input type="email" name="email" placeholder="이메일" />
    <button type="submit">가입</button>
</form>
</body>
</html>